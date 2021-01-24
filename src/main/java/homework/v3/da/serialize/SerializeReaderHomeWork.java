package homework.v3.da.serialize;

import homework.v3.entity.serialize.JsonFileClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializeReaderHomeWork {
	
	public JsonFileClass customSerializeReader(String filename) throws IOException, ClassNotFoundException {
		try (FileInputStream fos = new FileInputStream(filename)){
			try (ObjectInputStream oos = new ObjectInputStream(fos)){
				return (JsonFileClass)oos.readObject();
			}
		}
		
	}
	
}
