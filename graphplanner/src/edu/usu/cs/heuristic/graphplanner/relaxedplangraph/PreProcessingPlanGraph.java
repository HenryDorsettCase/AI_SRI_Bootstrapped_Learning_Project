/**
 * PDDL Graph Planner
 * Zeyn Saigol <zeyn@zeyn.net>
 * School of Computer Science
 * University of Birmingham
 *
 * $Id: PlanGraph.java 33 2007-02-23 15:45:34Z zas $
 */
package edu.usu.cs.heuristic.graphplanner.relaxedplangraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.usu.cs.pddl.domain.ActionDef;
import edu.usu.cs.pddl.domain.DefaultActionInstance;
import edu.usu.cs.pddl.domain.ConsistentLiteralSet;
import edu.usu.cs.pddl.domain.DefaultProblem;
import edu.usu.cs.pddl.domain.Domain;
import edu.usu.cs.pddl.domain.FormalArgument;
import edu.usu.cs.pddl.domain.PDDLObject;
import edu.usu.cs.pddl.domain.Problem;
import edu.usu.cs.search.plangraph.IllDefinedProblemException;

/**
 * Manages a planning graph, consisting of a sequence of {@link Level} objects.
 */
/*
 * TODO: Potential performance improvements & other misc tasks
 * - Have ConsistentLiteralSet store a Map<LiteralInstance, Literal> natively
 *   (& maybe the Set also for performance reasons...)
 * - Implement HEURISTICS for graph solving (literal with highest level-cost first)
 * - Make Pair non-immutable, to avoid object creation overhead in areMutex() methods
 */
public class PreProcessingPlanGraph extends PlanGraph
{
//    private static Logger logger = Logger.getLogger(PreProcessingPlanGraph.class.getName());

    private final List<PreProcessingLevel> levels = new ArrayList<PreProcessingLevel>();
    private final Domain domain;
    private final Problem problem;
    private final List<DefaultActionInstance> actionInstances;

    public PreProcessingPlanGraph(Domain domain, Problem problem2) throws IllDefinedProblemException
    {
        if (domain == null || problem2 == null) {
            throw new IllegalArgumentException("null domain/problem");
        }
        this.domain = domain;
        this.problem = problem2;

        // Create all the ActionInstance objects needed in the problem
        actionInstances = createActionInstances(domain, problem2);
        //actionInstances = new ArrayList<ActionInstance>();
        
//        logger.info("All action instances in problem:");
//        for (ActionInstance ai : actionInstances) {
//            logger.info(ai.toString());
//        }

        // Construct "dummy" first level containing initial state
        PreProcessingLevel startLevel = PreProcessingLevel.createStartLevel(actionInstances, problem2);
        levels.add(startLevel);
    }

    /** @numLevels number of levels, including the start state */
    public PreProcessingPlanGraph(Domain domain, DefaultProblem problem, int numLevels) throws IllDefinedProblemException
    {
        this(domain, problem);
        if (numLevels < 2) {
            throw new IllegalArgumentException("At least two levels are needed in a plan graph");
        }

        for (int l = 1; l < numLevels; l++) {
            final PreProcessingLevel newLevel = new PreProcessingLevel(levels.get(l-1), actionInstances, domain, problem);
            levels.add(newLevel);
        }
    }

    public Level addLevel()
    {
        final PreProcessingLevel previousLevel = levels.get(levels.size() - 1);
        final PreProcessingLevel newLevel = new PreProcessingLevel(previousLevel, actionInstances, domain, problem);
        levels.add(newLevel);
        return newLevel;
    }
    
    public Level getLastLevel()
    {
        return levels.get(levels.size() - 1);
    }
    
    public boolean hasConverged() 
    {
        if (levels.size() < 3) {
            return false;
        } else {
            Level currentLevel = getLastLevel();
            Level previousLevel = currentLevel.getPreviousLevel();
            
            // TODO: Not completely sure that this guarantees convergence...
            return (currentLevel.getActions().size() == previousLevel.getActions().size())
                     && (currentLevel.getEndLiterals().equals(previousLevel.getEndLiterals()));
        }
    }

    private List<DefaultActionInstance> createActionInstances(Domain domain, Problem problem2)
                            throws IllDefinedProblemException
    {
        List<DefaultActionInstance> instances = new ArrayList<DefaultActionInstance>();
        Set<PDDLObject> allObjects = problem2.getObjects();

        // Iterate over all actions, creating multiple instances for each (probably)
        List<ActionDef> actionDefs = domain.getActions();
        int actIndex = 0;
        for (ActionDef action : actionDefs) {
            List<List<PDDLObject>> allowedActualArgs = getPossibleArguments(action, allObjects, problem2.getStartState());
            for (List<PDDLObject> actualArgs : allowedActualArgs) {
                DefaultActionInstance instance = new DefaultActionInstance(action, actualArgs, allObjects, actIndex++);
                instances.add(instance);
            }
        }
        return instances;
    }

    private List<List<PDDLObject>> getPossibleArguments(ActionDef action,
                                                        Set<PDDLObject> allObjects, 
                                                        ConsistentLiteralSet startState)
            throws IllDefinedProblemException
    {
        final List<PDDLObject> noObjects = Collections.emptyList();
        List<List<PDDLObject>> result = new ArrayList<List<PDDLObject>>();
        List<FormalArgument> arguments = action.getArguments();

        if (arguments.size() > allObjects.size()) {
            throw new IllDefinedProblemException("Not enough objects for arguments of action " + action.getName());
        } else if (arguments.size() == 0) {
            result.add(noObjects);
        } else {
            // General case of 1 or more arguments

            // Keep the results as a list of partial solutions, where each solution is a list of arguments
            // First stage is one solution, with no arguments-so-far
            result.add(noObjects);
            final Set<PDDLObject> remainingObjs = new HashSet<PDDLObject>();

            for (FormalArgument arg : arguments) {
                // After dealing with argument one, newSolns will be a list of arrays of length one, etc
                List<List<PDDLObject>> newSolns = new ArrayList<List<PDDLObject>>();

                for (List<PDDLObject> argsSoFar : result) {
                    // Get correct set of all objects not used in the argument list so far
                    remainingObjs.clear();
                    remainingObjs.addAll(allObjects);
                    remainingObjs.removeAll(argsSoFar);

                    for (PDDLObject obj : remainingObjs) {
                        if (arg.typeMatches(obj)) {
                            final List<PDDLObject> newArgList = new ArrayList<PDDLObject>(argsSoFar);
                            newArgList.add(obj);
                            if(action.isLegalPartialInstantiation(newArgList, startState, allObjects)){
                            	newSolns.add(newArgList);
                            }
                        }
                    }
                }
                result = newSolns;
            }
        }
        return result;
    }
}
