package com.abi.trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintTreeLevelInReverse {

    public static void leveOrderTravelInReverse(BinaryTreeNode root){
        if(root==null){
            return;
        }
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp.getLeft()!=null)
                q.offer(tmp.getLeft());
            if(tmp.getRight()!=null)
                q.offer(tmp.getRight());
            s.push(tmp);
        }
        while(!s.isEmpty())
            System.out.println(s.pop().getData());
    }
}
