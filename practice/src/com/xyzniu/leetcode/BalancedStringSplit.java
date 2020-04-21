package com.xyzniu.leetcode;

public class BalancedStringSplit {
    
    public int balancedStringSplit(String s) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'L':
                    index++;
                    break;
                case 'R':
                    index--;
                    break;
            }
            if (index == 0) {
                count++;
            }
        }
        return count;
    }
    
}
