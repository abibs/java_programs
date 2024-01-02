package com.abi.trees.binaryTree;

public class BinaryTreeNode {

    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    /**
     *
     * <pre>
     *     <b>Classifying the Traversals</b>
     * The sequence in which these entities (nodes) are processed defines a particular traversal method.
     * The classification is based on the order in which current node is processed. That means, if we are
     * classifying based on current node (D) and if D comes in the middle then it does not matter
     * whether L is on left side of D or R is on left side of D.
     * Similarly, it does not matter whether L is on right side of D or R is on right side of D. Due to this,
     * the total 6 possibilities are reduced to 3 and these are:
     * • Preorder (DLR) Traversal
     * • Inorder (LDR) Traversal
     * • Postorder (LRD) Traversal
     *
     *
     *     <b>PreOrder Traversal</b>
     * In preorder traversal, each node is processed before (pre) either of its subtrees. This is the
     * simplest traversal to understand. However, even though each node is processed before the
     * subtrees, it still requires that some information must be maintained while moving down the tree.
     * In the example above, 1 is processed first, then the left subtree, and this is followed by the right
     * subtree.
     * Therefore, processing must return to the right subtree after finishing the processing of the left
     * subtree. To move to the right subtree after processing the left subtree, we must maintain the root
     * information. The obvious ADT for such information is a stack. Because of its LIFO structure, it is
     * possible to get the information about the right subtrees back in the reverse order.
     * Preorder traversal is defined as follows:
     * • Visit the root.
     * • Traverse the left subtree in Preorder.
     * • Traverse the right subtree in Preorder.
     *
     *
     * <b>Time Complexity: O(n). Space Complexity: O(n)</b>
     * </pre>
     *
     * @param root
     */
    public void preOrder(BinaryTreeNode root){
        if(root!=null){
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }


    /**
     * <pre><b>PostOrder Traversal</b>
     * In postorder traversal, the root is visited after both subtrees. Postorder traversal is defined as
     * follows:
     * • Traverse the left subtree in Postorder.
     * • Traverse the right subtree in Postorder.
     * • Visit the root.
     *
     * Time Complexity: O(n). Space Complexity: O(n)</pre>*/
    public void postOrder(BinaryTreeNode root){
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println(root.getData());
    }

    /**
     * <pre> <b>InOrder Traversal</b>
     * In Inorder Traversal the root is visited between the subtrees. Inorder traversal is defined as
     * follows:
     * • Traverse the left subtree in Inorder.
     * • Visit the root.
     * • Traverse the right subtree in Inorder.
     * Time Complexity: O(n). Space Complexity: O(n).</pre>*/
    public void inOrder(BinaryTreeNode root){
        if(root!=null){
            inOrder(root.getLeft());
            System.out.println(root.getData());
            inOrder(root.getRight());
        }
    }
}
