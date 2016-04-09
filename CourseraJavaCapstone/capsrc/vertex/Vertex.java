package vertex;

import java.util.Map;
import java.util.List;


public interface Vertex {
	int getId ();
	Map<String, String> getProperties();
	List <Vertex> getNeighbors();
	
	
}
