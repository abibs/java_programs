package com.abi.trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumElement {

    /**
     *<b>Problem-1 Give an algorithm for finding maximum element in binary tree.
     * </b>
     * <br>
     * USING RECURSION
     */

    public int maxElementByRecursion(BinaryTreeNode root) {
        int maxVal = Integer.MIN_VALUE;
        if (root == null) {
            int leftEle = maxElementByRecursion(root.getLeft());
            int rightEle = maxElementByRecursion(root.getRight());

            if (leftEle > rightEle)
                maxVal = leftEle;
            else
                maxVal = rightEle;

            if (root.getData() > maxVal)
                maxVal = root.getData();
        }
        return maxVal;
    }//Time Complexity: O(n). Space Complexity: O(n)


    /** <b>Problem-2 Give an algorithm for finding maximum element in binary tree without recursion.
     </b>
     **/
    public int maxElementWithoutRecursion(BinaryTreeNode root){
        if(root==null)
            return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp.getData()>max){
                max= tmp.getData();
            }
            if(tmp!=null){
                if(tmp.getLeft()!=null){
                    q.offer(tmp.getLeft());
                }
                if(tmp.getRight()!=null){
                    q.offer(tmp.getRight());
                }
            }
        }
        return max;
    }//Time Complexity: O(n). Space Complexity: O(n).



}
