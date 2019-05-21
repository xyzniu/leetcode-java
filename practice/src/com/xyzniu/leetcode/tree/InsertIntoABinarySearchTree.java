package com.xyzniu.leetcode.tree;

/**
 * 701
 */
public class InsertIntoABinarySearchTree {
    
    /**
     * 给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 保证原始二叉搜索树中不存在新值。
     * 注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回任意有效的结果。
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        invert(root, val);
        return root;
    }
    
    private void invert(TreeNode root, int val) {
        if (root.val < val) {
            if (root.right == null) {
                root.right = new TreeNode(val);
            } else {
                invert(root.right, val);
            }
        } else {
            if (root.left == null) {
                root.left = new TreeNode(val);
            } else {
                invert(root.left, val);
            }
        }
    }
    
    
}
