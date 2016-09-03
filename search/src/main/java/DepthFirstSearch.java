/**
 * Created by tesnick on 31/08/16.
 */
public class DepthFirstSearch {

    void search(GraphNode root) {

        if (root == null) return;

        visit(root);
        root.visited = true;

        for (GraphNode n : root.adjacent) {
            if (n.visited == false) {
                search(n);
            }
        }
    }

    private void visit(GraphNode root) {
        System.out.println("Visiting " + root);
    }
}
