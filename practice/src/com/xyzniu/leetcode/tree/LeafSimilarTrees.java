package com.xyzniu.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 872
 */
public class LeafSimilarTrees {

    /**
     * 请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
     * 举个例子，如上图所示，给定一颗叶值序列为 (6, 7, 4, 9, 8) 的树。
     * 如果有两颗二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
     * 如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。
     *
     * @param root1
     * @param root2
     * @return
     */
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        leaf(root1, list1);
        leaf(root2, list2);
        if(list1.size()!=list2.size()) {
        	return false;
        }
        for(int i = 0; i < list1.size(); i++) {
        	if(list1.get(i)!=list2.get(i)) {
        		return false;
        	}
        }
        return true;
    }

	private void leaf(TreeNode root, ArrayList<Integer> list) {
		if(root==null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.empty()) {
			TreeNode n = stack.pop();
			if(n.left==null && n.right==null) {
				list.add(n.val);
			}else {
				if(n.right!=null) {
					stack.push(n.right);
				}
				if(n.left!=null) {
					stack.push(n.left);
				}
			}
		}
	}
}
