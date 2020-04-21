package com.xyzniu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDivided(i)) {
                list.add(i);
            }
        }
        return list;
    }
    
    private boolean isDivided(int number) {
        int n = number;
        while (n != 0) {
            int nn = n % 10;
            if (nn == 0 || number % nn != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
    
}
