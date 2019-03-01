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
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
