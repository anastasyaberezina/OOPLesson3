package Per;

import java.io.IOException;
import java.util.ArrayList;
// Интерфейс
public interface GeoTree extends Printer{
    ArrayList<Node> tree = new ArrayList<>();
    void append (Person children);
    default ArrayList<Node> getTree(){ return tree;}
    default void print() throws IOException{  // Здесь реализован метод print
        FileWriter fileWriter = new FileWriter("Research.txt", true);
        for (Node node: getTree()) {
            fileWriter.write(node.toString());
            fileWriter.write('\n');
        }
        fileWriter.write("---");
        fileWriter.write('\n');
        fileWriter.flush();
    }

}
