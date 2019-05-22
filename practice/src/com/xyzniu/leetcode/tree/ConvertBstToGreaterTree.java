package com.xyzniu.leetcode.tree;

/**
 * 538
 */
public class ConvertBstToGreaterTree {
    
    private int num = 0;
    
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        num += root.val;
        root.val = num;
        convertBST(root.left);
        return root;
    }
    
}
