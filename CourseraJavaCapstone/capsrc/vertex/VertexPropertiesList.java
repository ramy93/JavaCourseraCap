package vertex;
import java.util.HashSet;


public class VertexPropertiesList implements VertexProperties<HashSet<String>>{
	
	private HashSet<String> propertyList;
	
	public VertexPropertiesList (){
		propertyList = new HashSet<String>();
	}
	public void addProperty (String propertyToAdd) {
		if (!propertyList.contains(propertyToAdd)){
			propertyList.add(propertyToAdd);
			
		}
		
	}
	public HashSet<String> getPropertyList (){
		return this.propertyList;
	}
}
