package com.xyzniu.leetcode;

import com.xyzniu.leetcode.tree.TreeNode;

public class SortedArrayToBST {

    
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
        
    }
    
    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        } else if (start == end) {
            return new TreeNode(nums[start]);
        }
        int index = (start + end) / 2;
        TreeNode node = new TreeNode(nums[index]);
        node.left = sortedArrayToBST(nums, start, index - 1);
        node.right = sortedArrayToBST(nums, index + 1, end);
        return node;
    }
    
}
