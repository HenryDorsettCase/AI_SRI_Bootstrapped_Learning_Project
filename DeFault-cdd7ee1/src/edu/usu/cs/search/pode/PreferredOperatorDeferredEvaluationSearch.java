package edu.usu.cs.search.pode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.Logger;


import edu.usu.cs.heuristic.Heuristic;
import edu.usu.cs.pddl.domain.ActionInstance;
import edu.usu.cs.pddl.domain.Domain;
import edu.usu.cs.pddl.domain.Problem;
import edu.usu.cs.pddl.domain.incomplete.Proposition;
import edu.usu.cs.planner.NumericMetric;
import edu.usu.cs.planner.PlanMetric;
import edu.usu.cs.planner.Solver;
import edu.usu.cs.planner.SolverOptions;
import edu.usu.cs.planner.util.FaultCounter;
import edu.usu.cs.planner.util.RiskCounterNode;
import edu.usu.cs.search.AbstractSearch;
import edu.usu.cs.search.AbstractStateNode;
import edu.usu.cs.search.FaultStateNode;
import edu.usu.cs.search.IncompletePINode;
import edu.usu.cs.search.Search;
import edu.usu.cs.search.SearchStatistics;
import edu.usu.cs.search.SolutionEvaluator;
import edu.usu.cs.search.StateNode;
import edu.usu.cs.search.incomplete.PIFaultSet;
import edu.usu.cs.search.plangraph.IllDefinedProblemException;

public class PreferredOperatorDeferredEvaluationSearch extends AbstractSearch implements Search {

	private static Logger logger = Logger.getLogger(PreferredOperatorDeferredEvaluationSearch.class.getName());

	// open (in DefaultSearch) is the not preferred operators
	protected PriorityQueue<StateNode> openPreferred = null;
	protected long preferredPriority = 0;
	protected long notPreferredPriority = 0;
	//protected PlanMetric[] currentBestHValue = null;
	protected StateNode bestNode = null;

	public PreferredOperatorDeferredEvaluationSearch(
			Domain domain, 
			Problem problem,
			List<ActionInstance> actionInstances,
			SolutionEvaluator solutionEvaluator,
			SearchStatistics searchStatistics,
			Solver solver
	) throws IllDefinedProblemException
	{
		super(domain, problem, actionInstances, solutionEvaluator, searchStatistics, solver);
		closed = new HashSet<StateNode>();
		open = new PriorityQueue<StateNode>();
		openPreferred = new PriorityQueue<StateNode>();
	}


	@Override
	public void initialize(StateNode node) {
		//node.getHeuristicValue();
		//solver.getHeuristic()
		openPreferred.add(node);

	}



	@Override
	public List<ActionInstance> getPath() {
		long expanded = 0;
		boolean foundSolution = false;
		long  startTime = System.currentTimeMillis();
		long timeLimit = (long) (5*60*1000);
		while(System.currentTimeMillis() - startTime < timeLimit) {
			PreferredOperatorDeferredEvaluationNode node;

			// If both queues are empty, there is no solution
			if(open.size() == 0 && openPreferred.size() == 0) {
				break;
			}

			boolean pulledPreferred = true;

			// Don't remove anything from an empty queue
			if(open.size() == 0) {
				node = (PreferredOperatorDeferredEvaluationNode)openPreferred.remove();
				preferredPriority--;
				pulledPreferred = true;
			} else if(openPreferred.size() == 0) {
				node = (PreferredOperatorDeferredEvaluationNode)open.remove();
				notPreferredPriority--;
				pulledPreferred = false;
			}
			// pull node from queue with the greatest value
			else if(//expandPreferred){//
					preferredPriority >= notPreferredPriority) {
				node = (PreferredOperatorDeferredEvaluationNode)openPreferred.remove();
				preferredPriority--;
				pulledPreferred = true;
			} else {
				node = (PreferredOperatorDeferredEvaluationNode)open.remove();
				notPreferredPriority--;
				pulledPreferred = false;
			}

			// Check to see if this is a duplicate node
			//logger.debug("Check CLosed" + ((FaultStateNode)node).getPropositions().keySet());
			//			PreferredOperatorDeferredEvaluationNode node = closed.remove(node);
			if(closed.contains(node)) {
				continue;
			}

			if(foundSolution){
				StateNode bestNode = solutionEvaluator.getBestSolution(solutions);
				int c = node.compareTo(bestNode);
				if(c == 1){
//					closed.add(node);
					continue;
				}
			}

			
			// Check to see if the solution is found in the node
			if(solutionEvaluator.isSolution(problem,node)) {
					if(solutionEvaluator.keepSolution(node, solutions)){
						//logger.debug("Found Solution: ");
								solutions.add(node);
					if(!foundSolution){
//						PriorityQueue<StateNode> nop = new PriorityQueue<StateNode>();
//						for(StateNode s : openPreferred){
//							int c = s.compareTo(node);
//							if(c < 1){
//								nop.add(s);
//							}
//						}
//						openPreferred = nop;

//						PriorityQueue<StateNode> op = new PriorityQueue<StateNode>();
//						for(StateNode s : open){
//							int c = s.compareTo(node);
//							if(c < 1){
//								op.add(s);
//							}
//						}
//						open = op;
						foundSolution =true;
					}
					
					
					searchStatistics.processNode(node);
					logger.debug(searchStatistics.toString()+" " + expanded);
					//openPreferred;//. = new PriorityQueue<StateNode>((Collection<? extends StateNode>) Arrays.asList(openPreferred.toArray()));
					//open = new PriorityQueue<StateNode>((Collection<? extends StateNode>) Arrays.asList(open.toArray()));

				}
				else{
					continue;
				}
					
				if(solutionEvaluator.isSolutionSetComplete(solutions)){
					StateNode bestNode = solutionEvaluator.getBestSolution(solutions);
					searchStatistics.setSolutionNode(bestNode);				
					return extractSolution(bestNode);
				}
			}

			//			if(((PreferredOperatorDeferredEvaluationNode)node).isHeuristicComputed()){
			//				// Add the notPreferredOperator children to open
			//				List<StateNode> notPreferredNodes = node.createSubsequentNodes(
			//						solver.getRelevantActions()
			//						//actionInstances
			//						, node.getPreferredOperators());
			//				//				for(StateNode cnode : notPreferredNodes)
			//				//					cnode.getHeuristicValue();
			//
			//				open.addAll(notPreferredNodes);
			//				((PreferredOperatorDeferredEvaluationNode)bestNode).setPreferredOperators(null);
			//				closed.add(node);
			//
			//			}
			//			else{
			//
			//
			//				// Compute node's H value
			//				node.getHeuristicValue();
			//
			//				if(((Double)((NumericMetric)node.getHeuristicValue()[0]).getValue()).equals(Double.MAX_VALUE)){
			//					closed.add(node);
			//					continue;
			//				}
			//
			//				// Add the preferredOperator children to openPreferred
			//				//List<ActionInstance> po = new ArrayList<ActionInstance>(node.getPreferredOperators());
			//				List<StateNode> preferredNodes = node.createSubsequentNodes(node.getPreferredOperators(), null);
			//
			//				openPreferred.addAll(preferredNodes);
			//				open.add(node);
			//				//				for(StateNode cnode : preferredNodes)
			//				//					cnode.getHeuristicValue();
			//
			//
			//			}

			// Compute node's H value
			node.getHeuristicValue();
			searchStatistics.processNode(node);
//			logger.debug(((FaultStateNode) node).getPropositions().keySet());
			if(node.deadEnd()){
				closed.add( node);
				continue;
			}
			// Add the notPreferredOperator children to open
			List<StateNode> notPreferredNodes = node.createSubsequentNodes(
					solver.getRelevantActions(), node.getPreferredOperators());

			open.addAll(notPreferredNodes);



			// Add the preferredOperator children to openPreferred
			List<StateNode> preferredNodes =  node.createSubsequentNodes(node.getPreferredOperators(), null);
			openPreferred.addAll(preferredNodes);
			closed.add(   node);

		searchStatistics.processNode( node);
			expanded++;

			// If the new h value is better than the current h value, add 1000 to 
			// the preferred operator priority counter
			if(bestNode == null ||
					node.compareTo(bestNode) < 0 ) {
				bestNode = node;
				if(pulledPreferred){
//										for(StateNode cnode : preferredNodes)
//											cnode.getHeuristicValue();
					

					preferredPriority += 5*preferredNodes.size();
				}
				else{
					//					for(StateNode cnode : notPreferredNodes)
					//						cnode.getHeuristicValue();

				}
				logger.debug(searchStatistics.toString()+" " + expanded);
				expanded = 0;
			}



			//logger.debug(searchStatistics.toString());

		}
			if(foundSolution){
			StateNode bestNode = solutionEvaluator.getBestSolution(solutions);
			searchStatistics.setSolutionNode(bestNode);				
			return extractSolution(bestNode);
		}
		else
			return null;
	
	}





}
