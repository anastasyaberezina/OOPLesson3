package Per;

public class RelatedRelationship {  //Родственная связь 1 этап

    Person one;
    Person second;
    Relations o;

    public RelatedRelationship(Person one, Person second, Relations o) {
        this.one = one;
        this.second = second;
        this.o = o;
    }

        /* public Person getOne {    // Надо ли это сдесь пока не ясно
            return one;
        }
        public Person getSecond {
            return second;
        }
        public Person getO {
            return o;
        } */


    @Override       //Переназначаю метод tostring, чтобы все прописывалось правильно
    public String toString() {
        return String.format("%s, %s, %s", one, second, o);
    }
}
