package com.xyzniu.leetcode.tree;

import java.util.Stack;

/**
 * 1038
 */
public class BinarySearchTreeToGreaterSumTree {
    
    public TreeNode bstToGst(TreeNode root) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode node = root;
        while (!stack.empty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.right;
            }
            node = stack.pop();
            sum += node.val;
            node.val = sum;
            node = node.left;
        }
        return root;
    }
    
}
