import java.awt.*;
import java.util.List;

public interface Node {
    String name();

    int x();

    int y();

    List<Node> children();

    void moveUp(int level);

    void moveDown(int level);

    void shiftLeft(int coefficient);

    void shiftRight(int coefficient);

    Rectangle info();
}
