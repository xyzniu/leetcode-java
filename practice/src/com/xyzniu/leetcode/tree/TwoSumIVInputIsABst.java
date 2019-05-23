package com.xyzniu.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * 653
 */
public class TwoSumIVInputIsABst {
    private HashSet<Integer> set = new HashSet<>();
    
    public boolean findTarget(TreeNode root, int k) {
        bst(root);
        for (int key : set) {
            if (set.contains(k - key)) {
                return true;
            }
        }
        return false;
    }
    
    private void bst(TreeNode root) {
        if (root == null) {
            return;
        }
        bst(root.left);
        set.add(root.val);
        bst(root.right);
    }
    
    
}
