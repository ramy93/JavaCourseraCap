package graph;

import vertex.*;
import edge.*;

public abstract class Graph {
	int numVertices;
	int numEdges;
	public abstract void addEdge(Edge e);
	public abstract void addVertex(Vertex v);
	public abstract void removeVertex(Vertex v);
	public abstract void removeEdge(Edge e);
	
	
	public  int getVertexCount(){
		return this.numVertices;
	}
	
	public int getEdgeCount(){
		return this.numEdges;
	}
	protected void setVertexCount(int n){
		this.numVertices =n;
	}
	
	protected void setEdgeCount(int n){
		this.numVertices =n;
	}
	
}
