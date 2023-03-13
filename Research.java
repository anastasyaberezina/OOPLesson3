package Per;

import com.sun.source.tree.Tree;
import java.util.ArrayList;
public class Search extends Tree { //Класс с методом поиска
    public ArrayList<String> res;
    public ArrayList<String> getRes(){
        return res;
    }
    ArrayList<Relationships.RelatedRelationship> rel;
    public Search(Relationships rel){
        res = rel.getName();
    }
    public ArrayList<String> spend (Person one, Person second, Relationships o) {
        for (Relationships.RelatedRelationship x : rel) {
            if (x.second.name == one.name && x.o == o) {
                res.add (x.second.name);
            }
        }
        return res;
    }
}
