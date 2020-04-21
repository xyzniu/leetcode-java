package com.xyzniu.leetcode;

import java.util.Arrays;

public class HeightChecker {
    
    public int heightChecker(int[] heights) {
        int[] sortedArray = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedArray);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (sortedArray[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
    
}
