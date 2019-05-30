package com.xyzniu.leetcode.tree;

import javafx.scene.Node;

/**
 * 110
 */
public class BalancedBinaryTree {
    
    class NodeDepth {
        boolean isBalaned;
        int depth;
        
        NodeDepth(boolean isBalaned, int depth) {
            this.isBalaned = isBalaned;
            this.depth = depth;
        }
    }
    
    public boolean isBalanced(TreeNode root) {
        NodeDepth n = isBalancedImpl(root);
        return n.isBalaned;
    }
    
    private NodeDepth isBalancedImpl(TreeNode root) {
        if (root == null) {
            return new NodeDepth(true, 0);
        }
        NodeDepth left = isBalancedImpl(root.left);
        NodeDepth right = isBalancedImpl(root.right);
        int depth = Math.max(left.depth, right.depth) + 1;
        boolean isBalanced = left.isBalaned && right.isBalaned && Math.abs(left.depth - right.depth) <= 1;
        return new NodeDepth(isBalanced, depth);
    }
    
}
