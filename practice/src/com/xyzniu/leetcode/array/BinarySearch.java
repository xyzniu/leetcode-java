package com.xyzniu.leetcode.array;

/**
 * 704
 */
public class BinarySearch {
    
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (nums[start] == target) {
            return start;
        } else if (nums[start + 1] == target) {
            return start + 1;
        } else {
            return -1;
        }
    }
    
}
