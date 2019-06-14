package com.xyzniu.leetcode.array;

/**
 * 1010
 */
public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    
    
    public int numPairsDivisibleBy60(int[] time) {
        int[] count = new int[60];
        for (int i = 0; i < time.length; i++) {
            count[time[i] % 60]++;
        }
        
        int rst = 0;
        if (count[0] != 0) {
            rst += count[0] * (count[0] - 1) / 2;
        }
        if (count[30] != 0) {
            rst += count[30] * (count[30] - 1) / 2;
        }
        for (int i = 1; i < 30; i++) {
            rst += count[i] * count[60 - i];
        }
        return rst;
    }
    
    
}
