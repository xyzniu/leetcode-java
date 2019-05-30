package com.xyzniu.leetcode.array;

import java.util.Arrays;

/**
 * 1051
 */
public class HeightChecker {
    
    public int heightChecker(int[] heights) {
        int[] sortedHeights = Arrays.copyOf(heights, heights.length);
        quicksort(sortedHeights, 0, sortedHeights.length - 1);
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) {
                sum++;
            }
        }
        return sum;
    }
    
    private void quicksort(int[] sortedHeights, int start, int end) {
        if (start >= end) {
            return;
        }
        int one = start;
        int left = start + 1;
        int right = end;
        while (left < right) {
            while (left < right && sortedHeights[left] <= sortedHeights[one]) {
                left++;
            }
            while (left < right && sortedHeights[right] >= sortedHeights[one]) {
                right--;
            }
            if (left < right) {
                swap(sortedHeights, left, right);
                left++;
                right--;
            }
        }
        int mid;
        if (sortedHeights[left] <= sortedHeights[one]) {
            mid = left;
        } else {
            mid = left - 1;
        }
        swap(sortedHeights, mid, one);
        quicksort(sortedHeights, start, mid - 1);
        quicksort(sortedHeights, mid + 1, end);
    }
    
    private void swap(int[] sortedHeights, int left, int right) {
        int temp = sortedHeights[left];
        sortedHeights[left] = sortedHeights[right];
        sortedHeights[right] = temp;
        
    }
    
}
