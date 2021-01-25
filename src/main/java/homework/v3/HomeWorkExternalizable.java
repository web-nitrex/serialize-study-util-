package homework.v3;

import homework.v3.da.externalize.JsonExternalizeReaderHomeWork;
import homework.v3.da.externalize.ExternalizeWriterHomeWork;
import homework.v3.da.externalize.ExternalizeReaderHomeWork;
import homework.v3.da.externalize.JsonExternalizeWriterHomeWork;
import homework.v3.entity.externalize.JsonFileClass;

import java.io.IOException;

/**
 * Задание
 * 1) Составить файл с JSON-объектом, который "разложен" в пакете homework.v3.classwork.entity.
 * Определить какой элемент является корневым
 * Дать имя файлу homework.parameters.json
 * Сделать файл с минимум пятью элементами
 * 2) Заполнить его значениями (как пример "parameters.v1.json")
 * 3) Считать получившийся homework.parameters.json в память
 * 4) Сериализовать его с помощью встроенного механиза сериализации в файл с именем homework.parameters.ser
 * 5) Сериализовать его с использованием интерфейса Externalizable в файл с именем homework.parameters.exter
 * 6) Считать данные из файла homework.parameters.ser в память и сохранить в формате JSON в файл с именем homework.result.ser.parameters.json
 * 7) Считать данные из файла homework.parameters.exter в память и сохранить в формате JSON в файл с именем homework.result.exter.parameters.json
 * 8) Убедиться, что файлы homework.result.ser.parameters.json и  homework.result.exter.parameters.json
 * совпадают с homework.parameters.json
 * 9) Составленную в п.1 сущность представить в виде xsd-схемы и
 * выполнить генерацию классов аналогично классам из пакета classwork.entity.jaxb
 * * можно сделать и с json-схемой, пренципиально механизм не поменяется.
 * */

public class HomeWorkExternalizable {
    public static final String SOURCE_FILE = "homework.parameters.json";
    public static final String SERIALIZE_FILE = "homework.parameters.exter";
    public static final String RESULT_FILE = "homework.result.exter.parameters.json";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Read data from file source JSON file" + SOURCE_FILE + "\n");
        JsonFileClass srcData = new JsonExternalizeReaderHomeWork().read(SOURCE_FILE);

        System.out.println("Write data to serialize file " + SERIALIZE_FILE + "\n");
        new ExternalizeWriterHomeWork().customExternalizeWriter(srcData, SERIALIZE_FILE);

        System.out.println("Read data from serialize file " + SERIALIZE_FILE + "\n");
        JsonFileClass readData = new ExternalizeReaderHomeWork().customExternalizeReader(SERIALIZE_FILE);

        System.out.println("Write data to result JSON file " + RESULT_FILE + "\n");
        new JsonExternalizeWriterHomeWork().customJsonWriter(readData, RESULT_FILE);
    }
}
