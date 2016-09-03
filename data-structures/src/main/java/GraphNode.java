import java.util.ArrayList;
import java.util.List;

/**
 * Created by tesnick on 31/08/16.
 */
public class GraphNode {

    boolean visited;

    List<GraphNode> adjacent = new ArrayList<>();

    Object data;

    public GraphNode(Object d) {
        data = d;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "visited=" + visited +
                ", adjacent=" + adjacent +
                ", data=" + data +
                '}';
    }
}
