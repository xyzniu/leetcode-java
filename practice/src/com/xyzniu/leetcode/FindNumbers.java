package com.xyzniu.leetcode;

public class FindNumbers {
    
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (test(i)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean test(int number) {
        if (number / 10000 > 0) {
            return false;
        } else if (number / 1000 > 0) {
            return true;
        } else if (number / 100 > 0) {
            return false;
        } else if (number / 10 > 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
