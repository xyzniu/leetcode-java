package com.xyzniu.leetcode.tree;

import java.util.List;

/**
 * 559
 */
public class MaximumDepthOfNAryTree {


    /**
     * 给定一个 N 叉树，找到其最大深度。
     * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
     *
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        List<Node> children = root.children;
        for (int i = 0; i < children.size(); i++) {
            max = Math.max(maxDepth(children.get(i)), max);
        }
        return 1 + max;
    }
}
