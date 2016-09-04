package nodes;

/**
 * The code below implements a very basic singly linked list.
 *
 * Time Complexity:
 *
 *        Average
 * Access Θ(n)
 * Search Θ(n)
 * Insert Θ(1)
 * Delete Θ(1)
 *
 * More info: https://en.wikipedia.org/wiki/Linked_list
 *
 * Created by tesnick on 31/08/16.
 */
public class Node {

    private Node next = null;
    private Object data;

    public Node(Object d) {
        data = d;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void appendToTail(int d) {

        Node end = new Node(d);
        Node n = this;

        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public Node deleteNode(Node head, int d) {

        Node n = head;

        if (n.data.equals(d)) {
            return head.next; /* moved head */
        }

        while (n.next != null) {
            if (n.next.data.equals(d)) {
                n.next = n.next.next;
                return head; /* head didn't change */
            }
            n = n.next;
        }

        return head;
    }
}
