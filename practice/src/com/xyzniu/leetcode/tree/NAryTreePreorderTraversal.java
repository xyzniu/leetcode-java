package com.xyzniu.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        List<Integer> rst = new ArrayList<Integer>();
        preorder(root, rst);
        return rst;
    }

    private void preorder(Node root, List<Integer> rst) {
        if (root == null) {
            return;
        }
        rst.add(root.val);
        List<Node> children = root.children;
        for (int i = 0; i < children.size(); i++) {
            preorder(children.get(i), rst);
        }
    }

    public List<Integer> preorder1(Node root) {
        List<Integer> rst = new ArrayList<>();
        if (root == null) {
            return rst;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node node = stack.pop();
            rst.add(node.val);
            List<Node> children = node.children;
            for (int i = children.size() - 1; i >= 0; i--) {
                Node temp = children.get(i);
                stack.push(temp);
            }
        }
        return rst;
    }
}

