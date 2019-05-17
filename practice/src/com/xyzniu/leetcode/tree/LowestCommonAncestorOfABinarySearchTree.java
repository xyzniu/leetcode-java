package com.xyzniu.leetcode.tree;

/**
 * 235
 */
public class LowestCommonAncestorOfABinarySearchTree {

    /**
     * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
     * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       int v1 = Math.min(p.val, q.val);
       int v2 = Math.max(p.val, q.val);
       return lowestCommonAncestor(root, v1, v2);
    }

	private TreeNode lowestCommonAncestor(TreeNode root, int v1, int v2) {
		if(root == null) {
			return null;
		}
		
		int val = root.val;
		
		if(v1<=val && v2 >=val) {
			return root;
		}else if(v1>=val) {
			return lowestCommonAncestor(root.right, v1, v2);
		}else {
			return lowestCommonAncestor(root.left, v1, v2);
		}
	}
}
