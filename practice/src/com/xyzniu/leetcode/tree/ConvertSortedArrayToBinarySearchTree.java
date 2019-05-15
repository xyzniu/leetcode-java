package com.xyzniu.leetcode.tree;

/**
 * 108
 */
public class ConvertSortedArrayToBinarySearchTree {
    
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start == end) {
            return new TreeNode(nums[start]);
        } else if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode t = new TreeNode(nums[mid]);
        t.left = sortedArrayToBST(nums, start, mid - 1);
        t.right = sortedArrayToBST(nums, mid + 1, end);
        return t;
    }
}
