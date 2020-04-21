package com.xyzniu.leetcode;

public class Maximum69Number {
    
    public int maximum69Number(int num) {
        char[] chs = String.valueOf(num).toCharArray();
        boolean changed = false;
        for (int i = 0; i < chs.length && !changed; i++) {
            if (chs[i] == '6') {
                chs[i] = '9';
                changed = true;
            }
        }
        return Integer.valueOf(String.valueOf(chs));
    }
    
}
