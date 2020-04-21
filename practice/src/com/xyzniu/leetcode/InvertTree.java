package com.xyzniu.leetcode;


import com.xyzniu.leetcode.tree.TreeNode;

public class InvertTree {
    
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        TreeNode node = new TreeNode(root.val);
        node.left = invertTree(root.right);
        node.right = invertTree(root.left);
        return node;
    }
    
}
