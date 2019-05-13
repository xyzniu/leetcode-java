package com.xyzniu.leetcode.tree;

import java.util.*;

/**
 * 589
 */
public class NAryTreePreorderTraversal {
    /**
     * 给定一个 N 叉树，返回其节点值的前序遍历。
     *
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> rst = new ArrayList<>();
        stack.add(root);
        while (!stack.empty()) {
            Node node = stack.pop();
            if (node == null) {
                continue;
            }
            rst.add(node.val);
            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.push(node.children.get(i));
            }
        }
        return rst;
    }
}

