package homework.v3.da.serialize;

import homework.v3.entity.serialize.JsonFileClass;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonSerializeWriterHomeWork {
    public void customJsonWriter(JsonFileClass jsonFileClass, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), jsonFileClass);
    }
}
