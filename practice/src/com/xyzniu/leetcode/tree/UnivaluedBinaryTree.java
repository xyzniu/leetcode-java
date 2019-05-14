package com.xyzniu.leetcode.tree;

/**
 * 965
 */
public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return isUnivalTree(root, root.val);
        }
        
    }
    
    public boolean isUnivalTree(TreeNode root, int val) {
        if (root == null) {
            return true;
        }
        if (root.val != val) {
            return false;
        }
        return isUnivalTree(root.left, val) && isUnivalTree(root.right, val);
    }
    
}
