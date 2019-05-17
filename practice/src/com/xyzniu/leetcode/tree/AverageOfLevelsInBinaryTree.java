package com.xyzniu.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 637
 */
public class AverageOfLevelsInBinaryTree {

    /**
     * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
     *
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> rst = new ArrayList<>();
        if(root == null) {
        	return rst;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	double sum = 0;
        	for(int i = 0; i < size; i++) {
        		TreeNode n = queue.poll();
        		sum+=n.val;
        		if(n.left!=null) {
        			queue.offer(n.left);
        		}
        		if(n.right!=null) {
        			queue.offer(n.right);
        		}
        	}
        	rst.add(sum/size);
        }
        return rst;
    }
}
