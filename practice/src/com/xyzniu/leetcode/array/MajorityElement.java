package com.xyzniu.leetcode.array;

/**
 * 169
 */
public class MajorityElement {


    /**
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在众数。
     * <p>
     * 执行用时：7ms
     * 内存消耗：36MB
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int one = 0;
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                one = nums[i];
                count++;
            } else if (nums[i] == one) {
                count++;
            } else {
                count--;
            }
        }
        return one;
    }

}
