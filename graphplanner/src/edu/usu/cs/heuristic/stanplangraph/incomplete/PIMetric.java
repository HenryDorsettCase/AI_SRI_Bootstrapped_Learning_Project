package edu.usu.cs.heuristic.stanplangraph.incomplete;

import edu.usu.cs.planner.PlanMetric;
import edu.usu.cs.search.incomplete.PIRiskSet;

public class PIMetric implements PlanMetric {

	PIRiskSet risks;
	
	public PIMetric(PIRiskSet grs) {
		risks = grs;
	}

	@Override
	public PlanMetric aggregate(PlanMetric d) {
		PIMetric pd = (PIMetric)d;
		if(pd != null){
			PIRiskSet grs = new PIRiskSet(this.risks);
			grs.union(pd.risks);
			return new PIMetric(grs);
		}
		return null;
	}

	@Override
	public int compareTo(PlanMetric m) {
		PIMetric pd = (PIMetric)m;
		if(pd != null){
			return this.risks.compareTo(pd.risks);
		}
		return -1;
	}

	@Override
	public boolean strictlyBetter(PlanMetric planMetric) {
		// TODO Auto-generated method stub
		return this.compareTo(planMetric)<0;
	}
	
	public String toString(){
		return Integer.toString(risks.getSet().size());
	}

}
