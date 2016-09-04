import nodes.Node;

/**
 * In computer science, a stack is an abstract data type that serves as a collection of elements, with two principal
 * operations: push, which adds an element to the collection, and pop, which removes the most recently added element
 * that was not yet removed. The order in which elements come off a stack gives rise to its alternative name,
 * LIFO (for last in, first out)
 *
 * More info: https://en.wikipedia.org/wiki/Stack_(abstract_data_type)
 *
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
