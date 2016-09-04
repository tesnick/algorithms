import nodes.GraphNode;

/**
 * Depth-first search (DFS) is an algorithm for traversing or searching tree or graph data structures. One starts at
 * the root (selecting some arbitrary node as the root in the case of a graph) and explores as far as possible along
 * each branch before backtracking.
 *
 * Time Complexity:
 *
 *        Average             Worst case
 *        Θ(|V|) or Θ(b^d)    Θ(|E|) or Θ(b^d)
 *
 * More info: https://en.wikipedia.org/wiki/Depth-first_search
 *
 * Created by tesnick on 31/08/16.
 */
public class DepthFirstSearch {

    void search(GraphNode root) {

        if (root == null) return;

        visit(root);
        root.setVisited(true);

        for (GraphNode n : root.getAdjacent()) {
            if (n.isVisited() == false) {
                search(n);
            }
        }
    }

    private void visit(GraphNode root) {
        System.out.println("Visiting " + root);
    }
}
