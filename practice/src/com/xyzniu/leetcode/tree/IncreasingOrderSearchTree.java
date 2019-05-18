package com.xyzniu.leetcode.tree;

import java.util.Stack;

/**
 * 897
 */
public class IncreasingOrderSearchTree {
    
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode n = new TreeNode(0);
        TreeNode one = n;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode t = stack.pop();
            one.right = t;
            one.left = null;
            one = one.right;
            root = t.right;
        }
        one.left = null;
        return n.right;
    }
    
    
    
}
