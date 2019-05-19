package com.xyzniu.leetcode.tree;

/**
 * 530
 */
public class MinimumAbsoluteDifferenceInBst {
    
    public int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        if (root == null) {
            return -1;
        }
        if (root.left != null) {
            min = Math.min(min, Math.abs(root.val - root.left.val));
        }
        if (root.right != null) {
            min = Math.min(min, Math.abs(root.val - root.right.val));
        }
        return Math.min(Math.min(min, getMinimumDifference(root.left)), getMinimumDifference(root.right));
    }
    
}
