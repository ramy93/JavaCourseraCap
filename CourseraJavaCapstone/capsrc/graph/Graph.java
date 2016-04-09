package graph;

import vertex.*;
import edge.*;

public abstract class Graph {
	public abstract void addEdge(Edge e);
	public abstract void addVertex(Vertex v);
	public abstract void removeVertex(Vertex v);
	public abstract void removeEdge(Edge e);
}
