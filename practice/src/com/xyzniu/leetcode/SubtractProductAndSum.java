package com.xyzniu.leetcode;

import java.util.ArrayList;

public class SubtractProductAndSum {
    
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> list = split(n);
        return product(list) - sum(list);
    }
    
    private int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
    
    private int product(ArrayList<Integer> list) {
        int product = 1;
        for (int i : list) {
            product *= i;
        }
        return product;
    }
    
    private ArrayList<Integer> split(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n == 0) {
            list.add(0);
        } else {
            while (n != 0) {
                list.add(n % 10);
                n = n / 10;
            }
        }
        return list;
    }
    
}
