package Per;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {   //Oбъекты класса Person
        Person firstPerson = new Person("Александр", 70);
        Person secondPerson = new Person("Мария", 60);
        Person thridPerson = new Person("Алексей", 45);
        Person fourtPerson = new Person("Елена",40);
        Person fifthPerson = new Person("Елена",40);

        firstPerson.append(secondPerson);
        firstPerson.append(thridPerson);
        secondPerson.append(fourtPerson);
        secondPerson.append(fifthPerson);

        secondPerson.getChildrenByPerson();
        secondPerson.getParents(Relationships.CHILDREN);
        firstPerson.print();




    }
}
