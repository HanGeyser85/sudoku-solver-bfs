
import java.util.List;

public class Node {

    Node Parent;
    List<Node> Children;
    SudokuBoard Board;

    public Node(List<Node> Children, Node Parent) {
        this.Children = Children;
        this.Parent = Parent;
    }
}
