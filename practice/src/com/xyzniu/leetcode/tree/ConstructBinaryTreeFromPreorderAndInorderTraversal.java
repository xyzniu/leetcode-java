package com.xyzniu.leetcode.tree;

/**
 * 105
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    /**
     * 根据一棵树的前序遍历与中序遍历构造二叉树。
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        return buildTree(preorder, inorder, 0, inorder.length - 1, 0);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int left, int right, int start) {
        if (left < 0 || right >= preorder.length || left > right) {
            return null;
        }
        if (left == right) {
            return new TreeNode(inorder[left]);
        }

        TreeNode node = new TreeNode(preorder[start]);
        int one = left;
        for (; one <= right; one++) {
            if (preorder[start] == inorder[one]) {
                break;
            }
        }
        node.left = buildTree(preorder, inorder, left, one - 1, start + 1);
        node.right = buildTree(preorder, inorder, one + 1, right, start + one - left + 1);
        return node;
    }


}
