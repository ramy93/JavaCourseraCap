package datastorage;

import java.util.HashMap;

public interface DataStorer {
	//TODO: Find a proper way to use this interface
	void storeDocument(HashMap<String,String> documentToStore);
}
