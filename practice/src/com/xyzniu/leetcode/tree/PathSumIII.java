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
        pathSumImpl(root, target);
        return pathCount;
    }
    
    private void pathSumImpl(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        target -= root.val;
        if (target == 0) {
            pathCount += 1;
        }
        if (target != this.target) {
            pathSumImpl(root.left, target);
            pathSumImpl(root.right, target);
        }
        pathSumImpl(root.left, this.target);
        pathSumImpl(root.right, this.target);
    }
    
    
}
