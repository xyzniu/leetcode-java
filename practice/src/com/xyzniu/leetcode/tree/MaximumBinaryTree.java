package com.xyzniu.leetcode.tree;

/**
 * 654
 */
public class MaximumBinaryTree {
    
    /**
     * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
     * 二叉树的根是数组中的最大元素。
     * 左子树是通过数组中最大值左边部分构造出的最大二叉树。
     * 右子树是通过数组中最大值右边部分构造出的最大二叉树。
     * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
     *
     * @param nums
     * @return
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }
    
    private TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        } else if (start == end) {
            return new TreeNode(nums[start]);
        } else {
            int max = start;
            for (int i = start; i <= end; i++) {
                if (nums[i] > nums[max]) {
                    max = i;
                }
            }
            TreeNode treeNode = new TreeNode(nums[max]);
            treeNode.left = constructMaximumBinaryTree(nums, start, max - 1);
            treeNode.right = constructMaximumBinaryTree(nums, max + 1, end);
            return treeNode;
        }
    }
    
}
