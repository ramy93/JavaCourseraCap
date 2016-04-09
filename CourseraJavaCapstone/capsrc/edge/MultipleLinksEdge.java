package edge;

import java.util.List;


public abstract class MultipleLinksEdge extends Edge implements DirectedType, WeightType {
	
	abstract List <Integer> getLinks();
	
}
