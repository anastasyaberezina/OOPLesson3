package Per;

import java.io.IOException;
import java.util.ArrayList;

public interface Printer {
    void print() throws IOException;
    default void print(ArrayList<Person> personArrayList) throws IOException { // Этот метод сохраняет данные в файл
        FileWriter fileWriter = new FileWriter("Research.txt", true);
        for (Person person: personArrayList) {  // берет ArrayList и записывает имена из него в файл
            fileWriter.write(person.getName());
            fileWriter.write('\n');
        }
        fileWriter.write("---");
        fileWriter.write('\n');
        fileWriter.flush;
    }
}