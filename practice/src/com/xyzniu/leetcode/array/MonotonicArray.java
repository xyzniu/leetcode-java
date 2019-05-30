package com.xyzniu.leetcode.array;

/**
 * 896
 */
public class MonotonicArray {
    
    
    public boolean isMonotonic(int[] A) {
        if (isUp(A) || isDown(A)) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean isDown(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                return false;
            }
        }
        return true;
    }
    
    private boolean isUp(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                return false;
            }
        }
        return true;
    }
    
}
