package com.xyzniu.leetcode.tree;

/**
 * 606
 */
public class ConstructStringFromBinaryTree {
    
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        } else {
            return treeToStr(t);
        }
    }
    
    private String treeToStr(TreeNode t) {
        if (t == null) {
            return null;
        }
        String left = treeToStr(t.left);
        String right = treeToStr(t.right);
        if (right == null) {
            if (left == null) {
                return String.valueOf(t.val);
            } else {
                return t.val + "(" + left + ")";
            }
        } else if (left == null) {
            return t.val + "()(" + right + ")";
        } else {
            return t.val + "(" + left + ")(" + right + ")";
        }
    }
    
}
