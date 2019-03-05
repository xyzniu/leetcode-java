package com.xyzniu.leetcode.tree;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    /**
     * 根据一棵树的中序遍历与后序遍历构造二叉树。
     *
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0 || postorder == null || postorder.length == 0) {
            return null;
        }
        return buildTree(inorder, postorder, 0, inorder.length - 1, inorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int left, int right, int start) {
        if (left > right || left < 0 || right >= inorder.length || start < 0 || start >= inorder.length) {
            return null;
        }
        if (left == right) {
            return new TreeNode(inorder[left]);
        }
        TreeNode node = new TreeNode(postorder[start]);
        int one = left;
        for (; one <= right; one++) {
            if (inorder[one] == postorder[start]) {
                break;
            }
        }
        node.left = buildTree(inorder, postorder, left, one - 1, start - (right - one + 1));
        node.right = buildTree(inorder, postorder, one + 1, right, start - 1);
        return node;
    }

}
