import nodes.BSTNode;

/**
 * Binary search trees keep their keys in sorted order, so that lookup and other operations
 * can use the principle of binary search: when looking for a key in a tree (or a place to
 * insert a new key), they traverse the tree from root to leaf, making comparisons to keys
 * stored in the nodes of the tree and deciding, based on the comparison, to continue searching
 * in the left or right subtrees. On average, this means that each comparison allows the operations
 * to skip about half of the tree, so that each lookup, insertion or deletion takes time
 * proportional to the logarithm of the number of items stored in the tree. This is much better
 * than the linear time required to find items by key in an (unsorted) array, but slower than
 * the corresponding operations on hash tables.
 *
 * Time Complexity:
 *
 *        Average   Worst case
 * Search Θ(log n)  O(n)
 * Insert Θ(log n)  O(n)
 * Delete Θ(log n)  O(n)
 *
 * More info: https://en.wikipedia.org/wiki/Binary_search_tree
 *
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

    public BSTNode search(int key, BSTNode node){

        System.out.println("Looking for key '" + key + "' on node " + node);

        if(node == null) return null;

        if(node.value == key) return node;

        else {
            BSTNode left = search(key, node.left);
            BSTNode right = search(key, node.right);

            if(left != null) return left;
            else return right;
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
