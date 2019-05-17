package com.xyzniu.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 257
 * @author xinyueniu
 *
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> rst = new ArrayList<>();
    	if(root==null) {
    		return rst;
    	}
    	List<Integer> row = new ArrayList<>();
    	path(root, rst, row);

    	return rst;
    }

	private void path(TreeNode root, List<String> rst, List<Integer> row) {
		if(root == null) {
			return;
		}

		row.add(root.val);
		if(root.left==null && root.right==null) {
			rst.add(toString(row));
			return;
		}
		
		if(root.left!=null) {
			path(root.left, rst, row);
			row.remove(row.size()-1);
		}
		if(root.right!=null) {
			path(root.right, rst, row);
			row.remove(row.size()-1);
		}
		
		
	}

	private String toString(List<Integer> row) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < row.size()-1; i++) {
			sb.append(row.get(i));
			sb.append("->");
		}
		sb.append(row.get(row.size()-1));
		return sb.toString();
	}
}
