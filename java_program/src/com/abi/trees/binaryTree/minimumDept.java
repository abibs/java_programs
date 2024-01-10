package com.abi.trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class minimumDept {

    public int minDepth(BinaryTreeNode root){
        if(root == null)
            return 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        int count =1;
        while(!q.isEmpty()){
            BinaryTreeNode currentNode = q.poll();
            if(currentNode!=null){
                if(currentNode.getLeft() ==null && currentNode.getRight() == null){
                    return count;
                }
                if(currentNode.getLeft()!=null){
                    q.offer(currentNode.getLeft());
                }

                if(currentNode.getRight()!=null){
                    q.offer(currentNode.getRight());
                }
            }else {
                if(!q.isEmpty()){
                    count ++;
                    q.offer(null);
                }
            }
        }
        return count;
    }
}
