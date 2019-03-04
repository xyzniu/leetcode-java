package com.xyzniu.leetcode.array;

/**
 * 414
 */
public class ThirdMaximumNumber {

    /**
     * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
     *
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {
        if (nums.length < 1) {
            return -1;
        }
        int max1 = nums[0];
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == max1) {
                continue;
            } else if (nums[i] > max1) {
                if (flag1) {
                    flag2 = true;
                } else {
                    flag1 = true;
                }
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] == max2) {
                flag1 = true;
                continue;
            } else if (nums[i] > max2) {
                if (flag1) {
                    flag2 = true;
                } else {
                    flag1 = true;
                }
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] == max3) {
                flag2 = true;
                continue;
            } else if (nums[i] > max3) {
                flag2 = true;
                max3 = nums[i];
            }
        }
        if (flag2) {
            return max3;
        } else {
            return max1;
        }
    }

}
