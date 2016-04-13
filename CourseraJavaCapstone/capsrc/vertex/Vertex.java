package vertex;

import java.util.Map;
import java.util.List;
import edge.*;

public abstract class Vertex {
	//each vertex has properties 
	//each vertex has neighbors
	//each vertex has an ID
	//each vertex has edges
	
	private List <Vertex> neighbors;
	private List <Edge> edges; 
	private String vertexId;
	private VertexProperties properties;
	
	VertexProperties getProperties(){
		return this.properties;
	}
	
	public void setProperties (VertexProperties properties){
		this.properties = properties;
	}
	
	public void setID (String id){
		this.vertexId=id;
	};
	
	String getID (){
		return this.vertexId;
	}
	
	abstract void setNeighbors();
	abstract List <Vertex> getNeighbors();
	
	abstract void setEdges();
	abstract List <Edge> getEdges();
	
}
