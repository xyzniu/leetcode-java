package com.xyzniu.leetcode.array;

/**
 * 80
 */
public class RemoveDuplicatesFromSortedArrayII {

    /**
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int prev = nums[0];
        int count = 1;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count >= 2 && nums[i] == prev) {
                continue;
            }
            if (nums[i] == prev) {
                nums[index++] = nums[i];
                count++;
            } else {
                nums[index++] = nums[i];
                count = 1;
            }
            prev = nums[i];
        }
        return index;
    }

}
