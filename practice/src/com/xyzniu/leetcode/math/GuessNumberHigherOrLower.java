package com.xyzniu.leetcode.math;

/**
 * 374
 */
public class GuessNumberHigherOrLower {
    
    
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public int guess(int num) {
        return -1;
    }
    
}
