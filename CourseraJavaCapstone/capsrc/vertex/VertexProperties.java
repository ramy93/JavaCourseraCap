package vertex;
import java.util.Set;

public interface VertexProperties <T extends Set> {
	
	public T  getPropertyList(); 
	//TODO : find a way to get properties 
	//TODO : Filtering will be done on these properties, so we should be careful here
	//TODO : need to be able to update properties
	
}
