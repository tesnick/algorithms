import nodes.Node;
import org.junit.Test;

/**
 * Created by tesnick on 31/08/16.
 */
public class NodeTest {

    @Test
    public void appendToTailTest() {

        Node linkedList = new Node(4);
        linkedList.appendToTail(45);
        linkedList.appendToTail(25);

        System.out.println("LinkedList -> " + linkedList);
    }

    @Test
    public void deleteNodeTest() {

        Node linkedList = new Node(4);
        linkedList.appendToTail(45);
        linkedList.appendToTail(25);

        System.out.println("LinkedList -> " + linkedList);

        Node node = linkedList.deleteNode(linkedList, 4);

        System.out.println("LinkedList -> " + node);

        linkedList = new Node(4);
        linkedList.appendToTail(45);
        linkedList.appendToTail(25);

        System.out.println("LinkedList -> " + linkedList);

        node = linkedList.deleteNode(linkedList, 45);

        System.out.println("LinkedList -> " + node);
    }
}
