package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 509
 */
public class FibonacciNumber {
    
    
    public int fib(int N) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= N; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        return list.get(N);
    }
    
}
