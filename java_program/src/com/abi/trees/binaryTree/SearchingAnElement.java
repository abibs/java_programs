package com.abi.trees.binaryTree;

import javax.print.attribute.standard.QueuedJobCount;
import java.util.LinkedList;
import java.util.Queue;

public class SearchingAnElement {


    /**<b>Problem-3 Give an algorithm for searching an element in binary tree. <br>
     * Using recursion </b>
     **/
    public static boolean findBinaryTreeByData(BinaryTreeNode root, int data){
        if(root == null)
            return Boolean.FALSE;
        if(root.getData() == data)
            return Boolean.TRUE;
        return findBinaryTreeByData(root.getLeft(),data) || findBinaryTreeByData(root.getRight(),data);

    }//Time Complexity: O(n). Space Complexity: O(n).

    /**<b>Problem-4 Give an algorithm for searching an element in binary tree. <br>
     * Without Using recursion </b>
     **/
    public static boolean findBinaryTreeByDataWithoutRecursion(BinaryTreeNode root, int data){
        if(root==null){
            return false;
        }
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp.getData() == data){
                return true;
            }
            if(tmp.getLeft()!=null){
                q.offer(tmp.getLeft());
            }
            if(tmp.getRight()!=null){
                q.offer(tmp.getRight());
            }
        }
        return false;
    }


}

