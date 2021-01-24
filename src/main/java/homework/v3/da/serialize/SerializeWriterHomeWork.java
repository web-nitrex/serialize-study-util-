package homework.v3.da.serialize;

import homework.v3.entity.serialize.JsonFileClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeWriterHomeWork {
	
	public void customSerializeWriter(JsonFileClass jsonFileClass, String fileName) throws IOException {
		try (FileOutputStream fos = new FileOutputStream(fileName)){
			try (ObjectOutputStream oos = new ObjectOutputStream(fos);){
				oos.writeObject(jsonFileClass);
			}
		}
	}
	
}
