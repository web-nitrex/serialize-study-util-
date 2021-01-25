package homework.v3.da.externalize;

import homework.v3.entity.externalize.JsonFileClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizeWriterHomeWork {
	
	public void customExternalizeWriter(JsonFileClass jsonFileClass, String fileName) throws IOException {
		try (FileOutputStream fos = new FileOutputStream(fileName)){
			try (ObjectOutputStream oos = new ObjectOutputStream(fos);){
				oos.writeObject(jsonFileClass);
			}
		}
	}
	
}
