package edu.usu.cs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.apache.log4j.Logger;

import edu.usu.cs.conformant.TranslationToCPP;
import edu.usu.cs.conformant.TranslationToCPP.TranslationType;
import edu.usu.cs.pddl.domain.ActionInstance;
import edu.usu.cs.pddl.domain.Domain;
import edu.usu.cs.pddl.domain.Problem;
import edu.usu.cs.pddl.domain.incomplete.IncompleteActionInstance;
import edu.usu.cs.pddl.parser.ANTLRDomainBuilder;
import edu.usu.cs.pddl.parser.ANTLRProblemBuilder;
import edu.usu.cs.pddl.parser.InvalidPDDLElementException;
import edu.usu.cs.pddl.parser.PDDLSyntaxException;
import edu.usu.cs.planner.CoveringSolver;
import edu.usu.cs.planner.PICoveringSolver;
import edu.usu.cs.planner.PODEBDDConditionalSolver;
import edu.usu.cs.planner.PODEBDDSolver;
import edu.usu.cs.planner.PODEFFSolver;
import edu.usu.cs.planner.PODEPISolver;
import edu.usu.cs.planner.Solver;
import edu.usu.cs.planner.SolverOptions;
import edu.usu.cs.planner.util.FaultCounter;
import edu.usu.cs.planner.util.RiskCounterNode;
import edu.usu.cs.search.FaultStateNode;
import edu.usu.cs.search.SearchStatistics;
import edu.usu.cs.search.plangraph.IllDefinedProblemException;

public class Default {

	private static Logger logger = Logger.getLogger(Default.class);

	public static void main(String[] args) {
		if (!(args.length == 3 || args.length == 4 || args.length == 5 || args.length == 6)) {
			usage();
		}
		File domainFile = new File(args[0]);
		if (!domainFile.exists()) {
			System.err.println("Unable to find PDDL domain file " + args[0]);
			usage();
		}
		File problemFile = new File(args[1]);
		if (!problemFile.exists()) {
			System.err.println("Unable to find PDDL problem file " + args[1]);
			usage();
		}

		Domain domain = null;
		Problem problem = null;
		try {
			ANTLRDomainBuilder domBuilder = new ANTLRDomainBuilder(domainFile);
			domain = domBuilder.buildDomain();
			ANTLRProblemBuilder probBuilder = new ANTLRProblemBuilder(domain,
					problemFile);
			problem = probBuilder.buildProblem();

		} catch (IOException e) {
			System.err.println("Error reading PDDL file(s): " + e);
			e.printStackTrace();
		} catch (PDDLSyntaxException e) {
			System.err.println("Syntax errors found in the PDDL file(s).");
		} catch (InvalidPDDLElementException e) {
			System.err.println("Invalid semantics in the PDDL file(s): " + e);
			e.printStackTrace();
		}

		Solver solver = null;
		SearchStatistics searchStatistics = new SearchStatistics();
		SolverOptions solverOptions = new SolverOptions();
		try {
			// Initialize search algorithm

			if(args.length > 4 && args[4].equalsIgnoreCase("anytime")){
				solverOptions.setSearchType(SolverOptions.SEARCHTYPE.ANYTIME);
			}
			else if(args.length > 4 && args[4].equalsIgnoreCase("cover")){
				solverOptions.setSearchType(SolverOptions.SEARCHTYPE.COVER);
			}
			else{
				solverOptions.setSearchType(SolverOptions.SEARCHTYPE.FIRST);
			}

			if (args[3].equalsIgnoreCase("length")) {
				solverOptions.setUsePreferredOperators(true);
				solverOptions.setUseDeferredEvaluation(true);

				solverOptions.setUseMultipleSupportersInPlanningGraph(false);
				solver = new PODEFFSolver(domain, problem, searchStatistics, solverOptions);
			} else if (args[3].length() > 4 && args[3].subSequence(0,4).toString().equalsIgnoreCase("pode")) {
				solverOptions.setUsePreferredOperators(true);
				solverOptions.setUseDeferredEvaluation(true);
				solverOptions.setUseMultipleSupportersInPlanningGraph(true);			
				solverOptions.setRiskArity(Integer.valueOf(args[3].substring(4)));
				solverOptions.setFaultType(SolverOptions.FAULT_TYPE.PI_FAULTS);
				if(solverOptions.getSearchType().equals(SolverOptions.SEARCHTYPE.COVER))
					solver = new PICoveringSolver(domain, problem, searchStatistics, solverOptions); 
				else
					solver = new PODEPISolver(domain, problem, searchStatistics, solverOptions);				
			} else if (args[3].equalsIgnoreCase("jdd")) {
				solverOptions.setUsePreferredOperators(true);
				solverOptions.setUseDeferredEvaluation(true);
				solverOptions.setUseMultipleSupportersInPlanningGraph(true);
				solverOptions.setFaultType(SolverOptions.FAULT_TYPE.BDD_FAULTS);
				FaultCounter.initialize(domain, problem, null);
				if(solverOptions.getSearchType().equals(SolverOptions.SEARCHTYPE.COVER))
					solver = new PICoveringSolver(domain, problem, searchStatistics, solverOptions); 
				else
					solver = new PODEBDDSolver(domain, problem, searchStatistics, solverOptions);

			} else if (args[3].equalsIgnoreCase("ao")) {
				solverOptions.setUsePreferredOperators(true);
				solverOptions.setUseDeferredEvaluation(true);
				solverOptions.setUseMultipleSupportersInPlanningGraph(true);
				solverOptions.setFaultType(SolverOptions.FAULT_TYPE.BDD_FAULTS);
				solverOptions.setConditional(true);
				FaultCounter.initialize(domain, problem, null);
				solver = new PODEBDDConditionalSolver(domain, problem, searchStatistics, solverOptions);
			}

			else if (args[2].contains(".pddl") && args[3].contains(".pddl")) {
				// Convert domain and problem files to ppddl.
				if ("pond".equals(args[4])) {
					TranslationToCPP.ConvertToCPP(domain, problem, args[2],
							args[3], TranslationType.pond);
				} else if ("pff".equals(args[4])) {
					TranslationToCPP.ConvertToCPP(domain, problem, args[2],
							args[3], TranslationType.pff);
				}
				return;
			} else {
				usage();
			}
		} catch (IllDefinedProblemException e) {
			e.printStackTrace();
		}

		List<List<ActionInstance>> plans = solver.run();
		// getPlan(search);

		if (plans == null) {
			logger.debug("\nNo plan found");
			return;
		}
		logger.debug("Elapsed time: \t\t" + searchStatistics.getElapsedTime()
				+ " milliseconds");
		if(solverOptions.getSearchType().equals(SolverOptions.SEARCHTYPE.COVER))
			return;
		for(List<ActionInstance> plan: plans){
			logger.debug("\nPlan found");
			for (ActionInstance action : plan) {
				logger.debug(action.getName());
			}

			// // Output the state sequence and actions in the plan
			// logger.debug("\n*********************************\n*** State Transition Sequence ***\n*********************************");
			// Node node = problem.getInitialNode();
			// for (Action action : plan) {
			// logger.debug(node);
			// logger.debug(action);
			// node = NodeUtilities.getSuccessorNode(node, action);
			// }
			// logger.debug(node);
			// logger.debug(problem.getGoal());
			// node = NodeUtilities.getSuccessorNode(node, problem.getGoal());
			// logger.debug(node);
			// logger.debug("*********************************\n*********************************");

			// // Output the risks
			// logger.debug("\nRisks: " +
			// finalNode.getCriticalRisks().size());
			// for (Risk risk : finalNode.getCriticalRisks()) {
			// logger.debug(risk);
			// }

			//		logger.debug("\nFinal Stats:\n");
			//		logger.debug("Plan length: " + plan.size());
			//		logger.debug("Elapsed time: " + searchStatistics.getElapsedTime()
			//				+ " milliseconds");
			//		logger.debug("Nodes expanded: " + searchStatistics.getNodesExpanded());
			//		if (searchStatistics.getSolutionNode() != null
			//				&& searchStatistics.getSolutionNode() instanceof FFRiskyNode) {
			//			logger.debug("Risk count: "
			//					+ ((FFRiskyNode) searchStatistics.getSolutionNode())
			//							.getCriticalRisks().size());
			//		}
			logger.debug("\nFinal Stats:\n");
			logger.debug("Plan length: " + plan.size());
			
			logger.debug("Nodes expanded: " + searchStatistics.getNodesExpanded());

			if (searchStatistics.getSolutionNode() != null
					//&& searchStatistics.getSolutionNode() instanceof FFRiskyNode
			) {
				//			logger.debug("Risk count: "
				//					+ ((FFRiskyNode) searchStatistics.getSolutionNode())
				//							.getCriticalRisks().size());
				//			logger.debug(((FFRiskyNode) searchStatistics.getSolutionNode())
				//							.getCriticalRisks());

				FaultCounter.initialize(domain, problem, plan);
				BigInteger total =BigInteger.valueOf(1).shiftLeft(FaultCounter.getNumRisks());
				BigInteger solvable = FaultCounter.getModelCount(domain, problem, plan, solver); 
				BigDecimal probability = new BigDecimal(solvable);
				probability = probability.divide(new BigDecimal(total));

				logger.debug("Solvable Domains: " + solvable);
				logger.debug("Total Domains: " + total);
				logger.debug("Probability: " + probability);
				logger.debug("Incomplete Features: " + FaultCounter.getNumRisks());

			}
			else if(searchStatistics.getSolutionNode() != null
					&& searchStatistics.getSolutionNode() instanceof RiskCounterNode) {
				logger.debug("Risk count: "
						+ ((RiskCounterNode) searchStatistics.getSolutionNode())
						.getGValue()[0]);
				FaultCounter.getBDD().printSet(FaultCounter.getBDD().not(((RiskCounterNode) searchStatistics.getSolutionNode())
						.getActRisks()));			
			}

			try {
				FileWriter fstream = new FileWriter("Output/" + args[2], true);
				BufferedWriter out = new BufferedWriter(fstream);
				if (searchStatistics.getSolutionNode() != null
						&& searchStatistics.getSolutionNode() instanceof FaultStateNode) {
					out.append((args.length == 6 ? args[5] + "\t" + args[4] + "\t"
							: "")
							+ domainFile.getName()
							+ "\t"
							+ problemFile.getName()
							+ "\t"
							+ args[3]
							       + "\t"
							       + plan.size()
							       + "\t"
							       + searchStatistics.getElapsedTime()
							       + "\t"
							       + searchStatistics.getNodesExpanded()
							       //						+ "\t"
							       //						+ ((FFRiskyNode) searchStatistics.getSolutionNode())
							       //								.getCriticalRisks().size() + "\r\n"
					);

				} else {
					out.append((args.length == 6 ? args[5] + "\t" + args[4] + "\t"
							: "")
							+ domainFile.getName()
							+ "\t"
							+ problemFile.getName()
							+ "\t"
							+ args[3]
							       + "\t"
							       + plan.size()
							       + "\t"
							       + searchStatistics.getElapsedTime()
							       + "\t"
							       + searchStatistics.getNodesExpanded()
							       + "\t"
							       + 0
							       + "\r\n");
				}

				out.close();
				logger.debug("\ninformation written to Output/" + args[2]);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static void usage() {
		System.err
		.println("usage: java GraphSolver <domain-pddl-file> <problem-pddl-file> <output file> <Search type (optional: either frisky(default), length, or uniformcost)>");
		System.exit(1);
	}
}
