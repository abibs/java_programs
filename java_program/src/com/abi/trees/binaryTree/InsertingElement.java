package com.abi.trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertingElement {

    /** <b>Give an algorithm for inserting an element into binary tree.
     </b>
     **/
    public BinaryTreeNode insertInBinaryTree(BinaryTreeNode root, int data){
        if(root == null)
            return null;

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp!=null){
                if(tmp.getLeft()!=null)
                    q.offer(tmp.getLeft());
                else{
                    tmp.setLeft(new BinaryTreeNode(data));
                    return root;
                }
            }
            if(tmp.getRight()!=null)
                q.offer(tmp.getRight());
            else{
            tmp.setRight(new BinaryTreeNode(data));
            return root;
            }
        }
        return root;
    }

    /** <b>Give an algorithm for inserting an element into binary tree.
     <br> Recursive Approach</b>
     **/
    public void insertInBinaryTreeByRecursive(BinaryTreeNode root, int data){
        if(root==null)
            root = new BinaryTreeNode(data);
        else
            insertHelper(root,data);
    }

    private void insertHelper(BinaryTreeNode root, int data) {
        if(root.getData()>=data){
            if(root.getLeft()==null)
                root.setLeft(new BinaryTreeNode(data));
            else
                insertHelper(root.getLeft(),data);
        }else{
            if(root.getRight()==null)
                root.setRight(new BinaryTreeNode(data));
            else
                insertHelper(root.getRight(),data);
        }
    }
}
