package graph;
import java.util.*;
import edge.*;
import vertex.*;

public class EnronGraph extends Graph{
	HashSet<Vertex> vertices;
	HashSet<Edge> edges;
	HashMap<Vertex, HashSet<Vertex>> graphLinks;
	
	public EnronGraph(){
		this.numEdges=0;
		this.numVertices=0;
	}
	@Override
	public void addEdge(Edge e) {
		
		this.numEdges+=1;
		// TODO Auto-generated method stub
	}

	@Override
	public void addVertex(Vertex v) {
		vertices.add(v);
		graphLinks.put(v, new HashSet<Vertex>());
		this.numVertices+=1;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVertex(Vertex v) {
		if (this.vertices.contains(v)){
			this.vertices.remove(v);
			this.setVertexCount(this.getVertexCount()-1);
		}
		else {
			System.out.println("Vertex does not exist to remove");
			return;
		
		}
		
		Iterator<Vertex> g= graphLinks.keySet().iterator();
	
		for (int i=0 ; i< graphLinks.size(); i++){
			
		}
		
	}

	@Override
	public void removeEdge(Edge e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
