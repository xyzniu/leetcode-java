package com.xyzniu.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个多叉树，返回其节点值的后序遍历
 */
public class NAryTreePostOrderTraversal {
    
    public List<Integer> postorder(Node root) {
        List<Integer> rst = new ArrayList<>();
        postorder(root, rst);
        return rst;
    }
    
    private void postorder(Node root, List<Integer> rst) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            postorder(root.children.get(i), rst);
        }
        rst.add(root.val);
    }
    
    
}
