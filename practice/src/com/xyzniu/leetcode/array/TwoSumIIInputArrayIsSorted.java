package com.xyzniu.leetcode.array;

/**
 * 167
 */
public class TwoSumIIInputArrayIsSorted {
    
    
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] indexs = new int[2];
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                indexs[0] = left + 1;
                indexs[1] = right + 1;
                return indexs;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return indexs;
    }
    
}
