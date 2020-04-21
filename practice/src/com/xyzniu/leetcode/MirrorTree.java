package com.xyzniu.leetcode;

import com.xyzniu.leetcode.tree.TreeNode;

public class MirrorTree {
    
    
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = mirrorTree(root.left);
        TreeNode left = mirrorTree(root.right);
        TreeNode node = new TreeNode(root.val);
        node.left = left;
        node.right = right;
        return node;
    }
    
}
