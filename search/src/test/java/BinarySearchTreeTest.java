import nodes.BSTNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Javier on 03/09/2016.
 */
public class BinarySearchTreeTest {

    private BinarySearchTree target = new BinarySearchTree();

    @Test
    public void insertTest(){

        target = new BinarySearchTree();

        target.insert(31);
        target.insert(3);
        target.insert(5);
        target.insert(55);
        target.insert(25);

        System.out.println("Finished!");
    }

    @Test
    public void findMinimumTest(){

        target = new BinarySearchTree();

        target.insert(31);
        target.insert(3);
        target.insert(5);
        target.insert(55);
        target.insert(25);

        Assert.assertEquals(3, target.findMinimum());
    }

    @Test
    public void findMaximumTest(){

        target = new BinarySearchTree();

        target.insert(31);
        target.insert(3);
        target.insert(5);
        target.insert(55);
        target.insert(25);

        Assert.assertEquals(55, target.findMaximum());
    }

    @Test
    public void printInorderTest(){

        target = new BinarySearchTree();

        target.insert(31);
        target.insert(3);
        target.insert(5);
        target.insert(55);
        target.insert(25);

        target.printInorder();
    }

    @Test
    public void printPreorderTest(){

        target = new BinarySearchTree();

        target.insert(31);
        target.insert(3);
        target.insert(5);
        target.insert(55);
        target.insert(25);

        target.printPreorder();
    }

    @Test
    public void printPostorderTest(){

        target = new BinarySearchTree();

        target.insert(31);
        target.insert(3);
        target.insert(5);
        target.insert(55);
        target.insert(25);

        target.printPostorder();
    }

    @Test
    public void notFound_searchTest() {

        target = new BinarySearchTree();

        target.insert(31);
        target.insert(3);
        target.insert(5);
        target.insert(55);
        target.insert(25);

        BSTNode resultNode = target.search(1, target.root);
        Assert.assertNull(resultNode);
    }

    @Test
    public void found_searchTest() {

        target = new BinarySearchTree();

        target.insert(31);
        target.insert(3);
        target.insert(5);
        target.insert(55);
        target.insert(25);

        BSTNode resultNode = target.search(55, target.root);
        Assert.assertEquals(resultNode.value, 55);
    }
}
