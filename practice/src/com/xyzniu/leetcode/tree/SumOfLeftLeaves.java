package com.xyzniu.leetcode.tree;

/**
 * 404
 */
public class SumOfLeftLeaves {
    private int sum;
    
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        if (root == null) {
            return 0;
        } else {
            sumOfLeftLeavesImpl(root, false);
        }
        return sum;
    }
    
    private void sumOfLeftLeavesImpl(TreeNode root, boolean fromLeft) {
        if (root == null) {
            return;
        }
        if (fromLeft && root.left == null && root.right == null) {
            sum += root.val;
            return;
        }
        sumOfLeftLeavesImpl(root.left, true);
        sumOfLeftLeavesImpl(root.right, false);
    }
}
