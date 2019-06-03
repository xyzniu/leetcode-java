package com.xyzniu.leetcode.tree;

/**
 * 437
 */
public class PathSumIII {
    
    private int pathCount;
    private int target;
    
    public int pathSum(TreeNode root, int sum) {
        pathCount = 0;
        target = sum;
        traversing(root);
        return pathCount;
    }
    
    private void traversing(TreeNode root) {
        if (root == null) {
            return;
        }
        pathSumImpl(root, target);
        traversing(root.left);
        traversing(root.right);
    }
    
    private void pathSumImpl(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        target -= root.val;
        if (target == 0) {
            pathCount += 1;
        }
        
        pathSumImpl(root.left, target);
        pathSumImpl(root.right, target);
    }
    
    
}
