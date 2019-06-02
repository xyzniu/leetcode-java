package com.xyzniu.leetcode.tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

/**
 * 671
 */
public class SecondMinimumNodeInABinaryTree {
    
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        HashSet<Integer> set = new HashSet<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode t = stack.pop();
            set.add(t.val);
            if (t.right != null) {
                stack.push(t.right);
            }
            if (t.left != null) {
                stack.push(t.left);
            }
        }
        if (set.size() == 1) {
            return -1;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int num = (int) it.next();
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second) {
                second = num;
            }
        }
        return second;
    }
    
}
