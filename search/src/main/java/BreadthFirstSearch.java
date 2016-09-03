import nodes.GraphNode;

/**
 * Created by tesnick on 31/08/16.
 */
public class BreadthFirstSearch {

    void search(GraphNode root) {

        Queue queue = new Queue();
        root.setVisited(true);
        visit(root);
        queue.enqueue(root); // Add to end of queue

        while (!queue.isEmpty()) {

            GraphNode r = (GraphNode) queue.dequeue();
            for (GraphNode n : r.getAdjacent()) {

                if (n.isVisited() == false) {
                    visit(n);
                    n.setVisited(true);
                    queue.enqueue(n);
                }
            }
        }
    }

    private void visit(GraphNode root) {
        System.out.println("Visiting ..." + root);
    }
}
