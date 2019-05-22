package com.xyzniu.leetcode.tree;

/**
 * 530
 */
public class MinimumAbsoluteDifferenceInBst {
    
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int min = Math.min(getMinimumDifference(root.left), getMinimumDifference(root.right));
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if (root.right != null) {
            right = getRightVal(root.right) - root.val;
        }
        if (root.left != null) {
            left =  root.val - getLeftVal(root.left);
        }
        int min2 = Math.min(left, right);
        return Math.min(min, min2);
    }
    
    private int getLeftVal(TreeNode left) {
        while (left.right != null) {
            left = left.right;
        }
        return left.val;
    }
    
    private int getRightVal(TreeNode right) {
        while (right.left != null) {
            right = right.left;
        }
        return right.val;
    }
    
    
}

