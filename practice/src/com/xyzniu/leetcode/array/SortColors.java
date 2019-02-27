package com.xyzniu.leetcode.array;

/**
 * 75
 */
public class SortColors {

    /**
     * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     * 注意:
     * 不能使用代码库中的排序函数来解决这道题。
     *
     * @param nums
     */
    public void sortColors(int[] nums) {
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                num0++;
            } else if (nums[i] == 1) {
                num1++;
            } else {
                num2++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int color = 0;
            if (i >= num0 && i < num0 + num1) {
                color = 1;
            } else if (i >= num0 + num1) {
                color = 2;
            }
            nums[i] = color;
        }
    }
}
