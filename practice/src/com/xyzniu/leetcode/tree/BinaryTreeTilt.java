package com.xyzniu.leetcode.tree;

/**
 * 563
 */
public class BinaryTreeTilt {
    
    private int tilt;
    
    public int findTilt(TreeNode root) {
        tilt = 0;
        sum(root);
        return tilt;
    }
    
    private int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        int abs = Math.abs(left - right);
        tilt += abs;
        return left + right + root.val;
    }
}
