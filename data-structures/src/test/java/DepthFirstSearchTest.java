import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tesnick on 31/08/16.
 */
public class DepthFirstSearchTest {

    @Test
    public void searchTest() {

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

        List<GraphNode> adjacents = new ArrayList<>();
        GraphNode node1 = new GraphNode(2);
        adjacents.add(node1);
        GraphNode node2 = new GraphNode(3);
        adjacents.add(node2);

        GraphNode graphNode = new GraphNode(4);
        graphNode.adjacent = adjacents;

        depthFirstSearch.search(graphNode);
    }
}