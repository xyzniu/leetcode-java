package com.xyzniu.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 993
 */
public class CousinsInBinaryTree {
    private int x;
    private int y;
    
    
    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean hasCousins = false;
            for (int i = 0; i < size; i += 2) {
                TreeNode tLeft = queue.poll();
                TreeNode tRight = queue.poll();
                
                if (hasCousins) {
                    if (test(tLeft) || test(tRight)) {
                        return true;
                    }
                } else if (test(tLeft) && test(tRight)) {
                    return false;
                } else if (test(tLeft) || test(tRight)) {
                    hasCousins = true;
                }
                if (tLeft != null) {
                    queue.offer(tLeft.left);
                    queue.offer(tLeft.right);
                }
                if (tRight != null) {
                    queue.offer(tRight.left);
                    queue.offer(tRight.right);
                }
            }
        }
        return false;
    }
    
    private boolean test(TreeNode node) {
        if (node == null) {
            return false;
        } else if (node.val == x || node.val == y) {
            return true;
        } else {
            return false;
        }
    }
    
}
