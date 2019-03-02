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
        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);
        return lowestCommonAncestor(root, min, max);
    }

    private TreeNode lowestCommonAncestor(TreeNode root, int min, int max) {
        if (root.val > max) {
            return lowestCommonAncestor(root.left, min, max);
        }
        if (root.val < min) {
            return lowestCommonAncestor(root.right, min, max);
        }
        return root;
    }

}
