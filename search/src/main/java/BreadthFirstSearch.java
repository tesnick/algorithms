import nodes.GraphNode;

/**
 * Breadth-first search (BFS) is an algorithm for traversing or searching tree or graph data structures.
 * It starts at the tree root (or some arbitrary node of a graph, sometimes referred to as a 'search key)
 * and explores the neighbor nodes first, before moving to the next level neighbors.
 *
 * Time Complexity:
 *
 *        Average             Worst case
 *        Θ(|V|) or Θ(b^d)    Θ(|E|) or Θ(b^d)
 *
 * |V| is number of vertices and |E| is the number of edges
 * b is the "branching" factor of the graph
 * d is the number of edge traversals
 *
 * More info: https://en.wikipedia.org/wiki/Breadth-first_search
 *
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
