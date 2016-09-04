import nodes.Node;

/**
 * In computer science, a queue (/ˈkjuː/ kyew) is a particular kind of abstract data type or collection in which the
 * entities in the collection are kept in order and the principal (or only) operations on the collection are the
 * addition of entities to the rear terminal position, known as enqueue, and removal of entities from the front termina
 * l position, known as dequeue. This makes the queue a First-In-First-Out (FIFO) data structure. In a FIFO data
 * structure, the first element added to the queue will be the first one to be removed. This is equivalent to the
 * requirement that once a new element is added, all elements that were added before have to be removed before the new
 * element can be removed.
 *
 * More info: https://en.wikipedia.org/wiki/Queue_(abstract_data_type)
 *
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
