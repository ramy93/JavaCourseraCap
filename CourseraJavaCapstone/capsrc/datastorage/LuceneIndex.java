package datastorage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;


// TODO: Make this A singleton
public class LuceneIndex implements DataStorer {
	
	IndexWriterConfig config;
	IndexWriter indexWriter;
	Directory indexDir;
	
	public LuceneIndex (String indexName) throws IOException{
		createIndex(indexName);
		this.config = new IndexWriterConfig( new StandardAnalyzer());
		this.indexWriter = new IndexWriter(indexDir, config);
	}
	public void createIndex(String indexName) throws IOException{
		
		Path path = Paths.get("index-directory");
		if (!Files.exists(path)){
			indexDir = FSDirectory.open(new File("index-directory").toPath());
		}
		else{
			indexDir = FSDirectory.open(path);
		}
	}
	
	private void indexDocument(Document doc) throws IOException{
		indexWriter.addDocument(doc);
		//System.out.println(emailContent);
	}

    Document doc = new Document();
    
	@Override
	public void storeDocument(HashMap<String, String> documentToStore) {
		Document doc = new Document();
		String text = "This is the text to be indexed.";
	    //doc.add(new TextField("fieldname", text, TextField.TYPE_STORED));
	   //doc.add(new TextField("emailtext", text, Field.Store.YES ));
	    //doc.add(new StringField("test", "five", Field.Store.YES));
	    //indexDocument(doc);
		
		// TODO: Set up a way to store documents....
		// TODO: very similar to the VertexProperties issue discussed previously
		
	}

}
