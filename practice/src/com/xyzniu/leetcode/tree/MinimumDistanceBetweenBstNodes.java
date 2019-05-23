package com.xyzniu.leetcode.tree;

/**
 * 783
 */
public class MinimumDistanceBetweenBstNodes {
    
    public int minDiffInBST(TreeNode root) {
        int a = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        if (root.left != null) {
            a = root.val - getRightNode(root.left);
            c = minDiffInBST(root.left);
        }
        int b = Integer.MAX_VALUE;
        int d = Integer.MAX_VALUE;
        if (root.right != null) {
            b = getLeftNode(root.right) - root.val;
            d = minDiffInBST(root.right);
        }
        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        return Math.min(min1, min2);
    }
    
    private int getLeftNode(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.val;
    }
    
    private int getRightNode(TreeNode node) {
        while (node.right != null) {
            node = node.right;
        }
        return node.val;
    }
}
