package edge.index;
import java.util.List;

import edge.*;

public class IndexedEdge extends MultipleLinksEdge {
	double weight;
	
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	@Override
	public void setWeight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateWeight() {
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getLinks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getEndpoints() {
		// TODO Auto-generated method stub
		return null;
	}

}
