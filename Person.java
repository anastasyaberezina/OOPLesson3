package Per;

public class Person { // Класс и свойства класса
    public String name;
    public int age;

    public Person(String name, int age){ // Конструктор

        this.name = name;
        this.age = age;
    }

    public String getName(){ // геттер для имени

        return name;
    }

    public void setName(String Name){ // сеттер для имени

        this.name=name;
    }

    public int getAge() { // геттер для возраста

        return age;
    }

    public void setAge(int age){ // сеттер для возраста

        this.age=age;
    }

    @Override
    public String toString(){
        return "Person{" + "name:" + name + "}";
    }
}
