package nodes;

/**
 * Created by Javier on 03/09/2016.
 */
public class BinarySearchTree {

    public BSTNode root;

    public void insert(int value){
        BSTNode node = new BSTNode(value);

        if(root == null){
            root = node;
            return;
        }

        insertRec(root, node);
    }

    private void insertRec(BSTNode latestRoot, BSTNode node) {

        if(latestRoot.value > node.value){
            if(latestRoot.left == null){

                latestRoot.left = node;
                return;

            } else {

                insertRec(latestRoot.left, node);

            }
        } else {
            if(latestRoot.right == null){

                latestRoot.right = node;
                return;

            } else {

                insertRec(latestRoot.right, node);
            }
        }
    }

    public int findMinimum(){

        if(root == null) return 0;

        BSTNode currNode = root;
        while(currNode.left !=null){
            currNode = currNode.left;
        }

        return currNode.value;
    }

    public int findMaximum(){

        if(root == null) return 0;

        BSTNode currNode = root;
        while(currNode.right !=null){
            currNode = currNode.right;
        }

        return currNode.value;
    }

    public void printInorder(){
        printInOrderRec(root);
        System.out.println("");
    }

    private void printInOrderRec(BSTNode currRoot) {

        if(currRoot == null) return;

        printInOrderRec(currRoot.left);
        System.out.println(currRoot.value+",");
        printInOrderRec(currRoot.right);
    }

    public void printPreorder(){
        printPreOrderRec(root);
        System.out.println("");
    }

    private void printPreOrderRec(BSTNode currRoot) {

        if(currRoot == null) return;

        System.out.println(currRoot.value+",");
        printPreOrderRec(currRoot.left);
        printPreOrderRec(currRoot.right);
    }

    public void printPostorder(){
        printPostOrderRec(root);
        System.out.println("");
    }

    private void printPostOrderRec(BSTNode currRoot) {

        if(currRoot == null) return;

        printPostOrderRec(currRoot.left);
        printPostOrderRec(currRoot.right);
        System.out.println(currRoot.value+",");
    }
}
