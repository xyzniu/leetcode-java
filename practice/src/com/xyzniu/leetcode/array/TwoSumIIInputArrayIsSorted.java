package com.xyzniu.leetcode.array;

/**
 * 167
 */
public class TwoSumIIInputArrayIsSorted {


    /**
     * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
     * <p>
     * 双指针
     * <p>
     * 执行用时：1ms
     * 内存消耗：26MB
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] rst = new int[2];

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                rst[0] = i + 1;
                rst[1] = j + 1;
                return rst;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return rst;
    }

}
