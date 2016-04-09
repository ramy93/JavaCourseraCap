package edge;

public abstract class Edge {
	int id;
	
	public abstract int [] getEndpoints ();
	public Edge getedge(){
		return this;
	};
	
}
