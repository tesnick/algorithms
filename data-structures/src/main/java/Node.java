/**
 * The code below implements a very basic singly linked list.
 * Created by tesnick on 31/08/16.
 */
public class Node {

    Node next = null;
    Object data;

    public Node(Object d) {
        data = d;
    }

    void appendToTail(int d) {

        Node end = new Node(d);
        Node n = this;

        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    Node deleteNode(Node head, int d) {

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
