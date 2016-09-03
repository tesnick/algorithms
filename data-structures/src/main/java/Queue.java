import nodes.Node;

/**
 * Created by tesnick on 31/08/16.
 */
public class Queue {

    private Node first, last;

    void enqueue(Object item) {
        if (first == null) {
            last = new Node(item);
            first = last;
        } else {
            last.setNext(new Node(item));
            last = last.getNext();
        }
    }

    Object dequeue() {
        if (first != null) {
            Object item = first.getData();
            first = first.getNext();
            return item;
        }
        return null;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
