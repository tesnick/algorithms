/**
 * Created by tesnick on 31/08/16.
 */
public class BreadthFirstSearch {

    void search(GraphNode root) {

        Queue queue = new Queue();
        root.visited = true;
        visit(root);
        queue.enqueue(root); // Add to end of queue

        while (!queue.isEmpty()) {

            GraphNode r = (GraphNode) queue.dequeue();
            for (GraphNode n : r.adjacent) {

                if (n.visited == false) {
                    visit(n);
                    n.visited = true;
                    queue.enqueue(n);
                }
            }
        }
    }

    private void visit(GraphNode root) {
        System.out.println("Visiting ..." + root);
    }
}
