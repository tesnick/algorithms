package nodes;

/**
 * Binary Search Tree (BST) node
 *
 * Created by Javier on 03/09/2016.
 */
public class BSTNode<T> {

    public int value;
    public BSTNode left;
    public BSTNode right;

    public BSTNode(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "BSTNode{value=" + value + '}';
    }
}
