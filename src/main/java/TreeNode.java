import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class TreeNode implements Node {
    private final String name;
    private final List<Node> children;
    private int x;
    private int y;

    public TreeNode(final String name, final List<Node> children, int x, int y) {
        this.name = name;
        this.children = children;
        this.x = x;
        this.y = y;
    }

    public TreeNode(final String name, Node... children) {
        this(name, Arrays.asList(children), 0, 0);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int x() {
        return x;
    }

    @Override
    public int y() {
        return y;
    }

    @Override
    public List<Node> children() {
        return children;
    }

    @Override
    public void moveUp(int level) {
        y -= level;
    }

    @Override
    public void moveDown(int level) {
        y += level;
    }

    @Override
    public void shiftLeft(int coefficient) {
        x -= coefficient;
    }

    @Override
    public void shiftRight(int coefficient) {
        x += coefficient;
    }

    @Override
    public Rectangle info() {
        // TODO: 12/3/24
        return null;
    }
}
