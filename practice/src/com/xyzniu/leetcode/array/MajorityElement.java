package com.xyzniu.leetcode.array;

/**
 * 169
 */
public class MajorityElement {


    /**
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在众数。
     * <p>
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
        	if(count == 0) {
        		num = nums[i];
        		count++;
        	}else if(nums[i]==num) {
        		count++;
        	}else {
        		count--;
        	}
        }
        return num;
    }

}
