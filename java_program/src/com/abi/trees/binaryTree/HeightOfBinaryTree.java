package com.abi.trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HeightOfBinaryTree {

    /**
     * <pre> Give an algorithm for finding the height (or depth) of the binary tree.</pre>*/
    public int maxDepthRecursive(BinaryTreeNode root){
        if(root==null)
            return 0;
        int leftDept = maxDepthRecursive(root.getLeft());
        int rightDept = maxDepthRecursive(root.getRight());
        return leftDept>rightDept ? 1+leftDept : 1+rightDept;
    }//Time Complexity: O(n). Space Complexity: O(n).


    /**
     * <pre> Give an algorithm for finding the height (or depth) of the binary tree.
     * <br> <b>WITH STACK</b></pre>*/
    public int maxDepthWithoutRecursive(BinaryTreeNode root){
        if(root == null)
            return 0;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        int maxDept =0;
        BinaryTreeNode prev = null;
        while(!s.isEmpty()){
            BinaryTreeNode curr = s.peek();
            if(prev==null || prev.getLeft() ==curr || prev.getRight() == curr){
                if(curr.getLeft()!=null)
                    s.push(curr.getLeft());
                else if (curr.getRight()!=null) {
                    s.push(curr.getRight());
                }
            } else if (curr.getLeft() == prev) {
                if(curr.getRight()!=null)
                    s.push(curr.getRight());
            }else
                s.pop();
            if(s.size()>maxDept)
                maxDept = s.size();
        }

        return maxDept;
    }

    /**
     * <pre> Give an algorithm for finding the height (or depth) of the binary tree.
     * <br> <b>WITH QUEUE</b></pre>*/
    public int minDepthWithOutRecursive(BinaryTreeNode root) {
        if (root == null)
            return 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        int count = 1;
        while (!q.isEmpty()) {
            BinaryTreeNode currentNode = q.poll();
            if (currentNode != null) {
                if (currentNode.getLeft() == null && currentNode.getRight() == null) {
                    return count;
                }
                if (currentNode.getLeft() != null) {
                    q.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    q.offer(currentNode.getRight());
                }

            } else {
                if(!q.isEmpty()){
                    count++;
                    q.offer(null);
                }
            }


        }
        return count;
    }
}
