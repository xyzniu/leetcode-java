package com.xyzniu.leetcode.tree;

/**
 * 543
 */
public class DiameterOfBinaryTree {
    private int maxDiameter;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        traversaing(root);
        return maxDiameter;
    }
    
    private void traversaing(TreeNode root) {
        if (root == null) {
            return;
        }
        maxDiameter = Math.max(maxDiameter, maxDepth(root.left) + maxDepth(root.right));
        traversaing(root.left);
        traversaing(root.right);
    }
    
    private int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
        }
    }
}
