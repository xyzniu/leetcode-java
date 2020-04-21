package com.xyzniu.leetcode;

public class ReplaceElements {
    
    public int[] replaceElements(int[] arr) {
        int max = -1;
        
        int[] rst = new int[arr.length];
        
        for (int i = arr.length - 1; i >= 0; i--) {
            rst[i] = max;
            max = Math.max(max, arr[i]);
        }
        return rst;
    }
}
