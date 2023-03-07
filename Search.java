package Per;

import java.util.ArrayList;

public class Search { //Класс с методом поиска
    public ArrayList<String> res;

    public ArrayList<String> getRes(){
        return res;
    }
    ArrayList<Relations.RelatedRelationship> rel;

    public Search(Relations rel){
        res = rel.getName();
    }
    public ArrayList<String> spend (Person one, Person second, Relations o) {
        for (Relations.RelatedRelationship x : rel) {
            if (x.second.name == one.name && x.o == o) {
                res.add (x.second.name);
            }
        }
        return res;
    }
}
