package homework.v3.da.externalize;

import homework.v3.entity.externalize.JsonFileClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExternalizeReaderHomeWork {
	
	public JsonFileClass customExternalizeReader(String filename) throws IOException, ClassNotFoundException {
		try (FileInputStream fos = new FileInputStream(filename)){
			try (ObjectInputStream oos = new ObjectInputStream(fos)){
				return (JsonFileClass)oos.readObject();
			}
		}
		
	}
	
}
