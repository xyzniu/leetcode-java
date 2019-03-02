package com.xyzniu.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429
 */
public class NAryTreeLevelOrderTraversal {

    /**
     * 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> rst = new ArrayList<>();
        if (root == null) {
            return rst;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node n = queue.poll();
                row.add(n.val);
                List<Node> children = n.children;
                for (int j = 0; j < children.size(); j++) {
                    queue.offer(children.get(j));
                }
            }
            rst.add(row);
        }
        return rst;
    }

}
