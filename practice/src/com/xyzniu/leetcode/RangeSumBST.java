package com.xyzniu.leetcode;

import com.xyzniu.leetcode.tree.TreeNode;

public class RangeSumBST {
    
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.val >= L && root.val <= R) {
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        } else if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        } else {
            return rangeSumBST(root.left, L, R);
        }
    }
    
}
