package homework.v3.da.externalize;

import homework.v3.entity.externalize.JsonFileClass;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonExternalizeWriterHomeWork {
    public void customJsonWriter(JsonFileClass jsonFileClass, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), jsonFileClass);
    }
}
