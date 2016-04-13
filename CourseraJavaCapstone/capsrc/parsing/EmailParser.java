package parsing;

import java.io.*;
import org.apache.lucene.*;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.lucene.store.*;

public class EmailParser {

	public static void main(String [] args ) throws FileNotFoundException, IOException {
		String fileName = "C:\\Users\\ramy.zulficar\\Desktop\\CS\\JavaOOP\\Capstone\\maildir\\badeer-r\\inbox\\1";
		BufferedReader newReader = new BufferedReader(new FileReader(fileName))  ;
		
		String emailContent=""; 
		
		//assuming all emails have 15 header fields
		for (int i=0 ; i < 15; i++){
			if (!(newReader!=null) ){
			return; 
			}
			String[] entry = newReader.readLine().split(":");
			
			String entryKey =entry[0];
			System.out.println(entryKey + " " + entry[1]);
			//System.out.println(newReader.readLine().split(",")[0]);
		
		}
		String toAdd= newReader.readLine();
		while (toAdd!= null){
			toAdd= toAdd.replaceAll("[^a-zA-z ]","").replace("\n", "").toLowerCase();
			
			
			if (toAdd.length()>0 && toAdd != null){
				emailContent += toAdd + " ";
			}
			toAdd=newReader.readLine();
		}
		
		
		//TODO : Move all this shit to an indexer class or something
		Path path = Paths.get("index-directory");
		Directory indexDir ;
		if (!Files.exists(path)){
			indexDir = FSDirectory.open(new File("index-directory").toPath());
		}
		else{
			indexDir = FSDirectory.open(path);
		}
		IndexWriterConfig config = new IndexWriterConfig( new StandardAnalyzer());
		IndexWriter indexWriter = new IndexWriter(indexDir, config);
		System.out.println(emailContent);


	    Document doc = new Document();
	    String text = "This is the text to be indexed.";
	    //doc.add(new TextField("fieldname", text, TextField.TYPE_STORED));
	    doc.add(new TextField("emailtext", text, Field.Store.YES ));
	    doc.add(new StringField("test", "five", Field.Store.YES));
	    //indexWriter.addDocument(doc);
	    
		
	}
}
