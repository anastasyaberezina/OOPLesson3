package Per;

import java.io.IOException;
import java.util.ArrayList;
// Интерфейс
public interface Research {
    ArrayList<Person> getParents(Relationships relationships) throws IOException; // Методы, требующие реализации
    ArrayList<Person> getChildrenByPerson() throws IOException;
}

