package com.abi.trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SizeofBinaryTree {

    public int sizeWithRecursion(BinaryTreeNode root){
        int leftCount = root.getLeft()==null ?0 : sizeWithRecursion(root.getLeft());
        int rightCount = root.getRight()==null ?0 : sizeWithRecursion(root.getRight());
        return 1 + leftCount+rightCount;
    }//Time Complexity: O(n). Space Complexity: O(n)

    public int sizeWithOutRecursion(BinaryTreeNode root){
        int count = 0;
        if(root==null)
            return 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            count++;

        if(tmp.getLeft()!=null)
            q.offer(tmp.getLeft());
        if(tmp.getRight()!=null);
            q.offer(tmp.getRight());
        }
        return count;
    }//Time Complexity: O(n). Space Complexity: O(n)
}
