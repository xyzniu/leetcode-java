package com.xyzniu.leetcode.tree;

/**
 * 226
 */
public class InvertBinaryTree {
    /**
     * 翻转一棵二叉树。
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        return root;
    }
    
}