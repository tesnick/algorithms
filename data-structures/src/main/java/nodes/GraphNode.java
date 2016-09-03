package nodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tesnick on 31/08/16.
 */
public class GraphNode {

    private boolean visited;

    private List<GraphNode> adjacent = new ArrayList<>();

    private Object data;

    public GraphNode(Object d) {
        data = d;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
               // "visited=" + visited +
               // ", adjacent=" + adjacent +
                ", data=" + data +
                '}';
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<GraphNode> getAdjacent() {
        return adjacent;
    }

    public void setAdjacent(List<GraphNode> adjacent) {
        this.adjacent = adjacent;
    }

    public Object getData() {
        return data;
    }
}
