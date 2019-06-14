package com.xyzniu.leetcode.tree;

public class SubtreeOfAnotherTree {
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        if (isSame(s, t)) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if (s != null && t != null && s.val == t.val) {
            return isSame(s.left, t.left) && isSame(s.right, t.right);
        } else {
            return false;
        }
    }
    
}

