import nodes.GraphNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tesnick on 31/08/16.
 */
public class BreadthFirstSearchTest {

    @Test
    public void searchTest() {

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();

        GraphNode child1 = new GraphNode(100);

        List<GraphNode> adjacents = new ArrayList<>();
        GraphNode node1 = new GraphNode(2);
        node1.setAdjacent(new ArrayList<GraphNode>() {{ add(child1); }} );
        adjacents.add(node1);
        GraphNode node2 = new GraphNode(3);
        adjacents.add(node2);

        GraphNode graphNode = new GraphNode(4);
        graphNode.setAdjacent(adjacents);

        breadthFirstSearch.search(graphNode);
    }
}