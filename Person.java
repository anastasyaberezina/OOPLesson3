package Per;

import lombok.Getter; //?
import lombok.Setter; //?
import java.io.IOException;
import java.util.ArrayList;

@Getter
@Setter
public class Person implements GeoTree, Research, Printer{ // Класс и свойства класса
    private String name;
    private int age;

    public Person(String name, int age){ // Конструктор
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { return name; }

    @Override
    public void append(Person children) {
        getTree().add. (new Node(this, Relationships.PARENT, children));
        getTree().add. (new Node(children, Relationships.CHILDREN, this));
    }

    @Override
    public ArrayList<Person> getParents(Relationships relationships) throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) && node.relationships.equals(relationships)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }

    @Override
    public ArrayList<Person> getChildrenByPerson() throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node node: getTree()) {
            if (node.person.getName().equals(this.getName())
                && node.relationships.equels(Relationships.PARENT)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }
}




