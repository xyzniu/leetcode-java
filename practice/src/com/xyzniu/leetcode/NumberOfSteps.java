package com.xyzniu.leetcode;

public class NumberOfSteps {
    
    public int numberOfSteps(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num % 2 == 0 ? numberOfSteps(num / 2) + 1 : numberOfSteps(num - 1) + 1;
        }
    }
}

