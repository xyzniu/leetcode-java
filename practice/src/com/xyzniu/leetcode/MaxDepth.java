package com.xyzniu.leetcode;

import com.xyzniu.leetcode.tree.Node;
import com.xyzniu.leetcode.tree.TreeNode;

public class MaxDepth {
    
    
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }
    
    
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < root.children.size(); i++) {
            max = Math.max(max, maxDepth(root.children.get(i)));
        }
        return max + 1;
    }
}
