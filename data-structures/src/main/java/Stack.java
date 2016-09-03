import nodes.Node;

/**
 * Created by tesnick on 31/08/16.
 */
public class Stack {

    private Node top;

    Object pop() {
        if (top != null) {
            Object item = top.getData();
            top = top.getNext();
            return item;
        }
        return null;
    }

    void push(Object item) {
        Node t = new Node(item);
        t.setNext(top);
        top = t;
    }

    Object peek() {
        return top.getData();
    }
}
