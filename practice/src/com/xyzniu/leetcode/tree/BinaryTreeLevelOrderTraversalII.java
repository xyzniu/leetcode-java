package com.xyzniu.leetcode.tree;

import java.util.*;

/**
 * 107
 */
public class BinaryTreeLevelOrderTraversalII {

    /**
     * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> rst = new ArrayList<>();
        if (root == null) {
            return rst;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode n = queue.poll();
                row.add(n.val);
                if (n.left != null) {
                    queue.offer(n.left);
                }
                if (n.right != null) {
                    queue.offer(n.right);
                }
            }
            rst.add(row);
        }
        Collections.reverse(rst);
        return rst;
    }

}
