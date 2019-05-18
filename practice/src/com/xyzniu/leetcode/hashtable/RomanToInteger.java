package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;
import java.util.Stack;

/**
 * 13
 */
public class RomanToInteger {
    
    public int romanToInt(String s) {
        HashMap<String, Integer> map = createMap1();
        int rst = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == s.length() - 1) {
                rst += map.get(String.valueOf(c));
                continue;
            }
            char c1 = s.charAt(i + 1);
            i++;
            if (c == 'I' && c1 == 'V') {
                rst += 4;
            } else if (c == 'I' && c1 == 'X') {
                rst += 9;
            } else if (c == 'X' && c1 == 'L') {
                rst += 40;
            } else if (c == 'X' && c1 == 'C') {
                rst += 90;
            } else if (c == 'C' && c1 == 'D') {
                rst += 400;
            } else if (c == 'C' && c1 == 'M') {
                rst += 900;
            } else {
                i--;
                switch (c) {
                    case 'I':
                        rst += 1;
                        break;
                    case 'V':
                        rst += 5;
                        break;
                    case 'X':
                        rst += 10;
                        break;
                    case 'L':
                        rst += 50;
                        break;
                    case 'C':
                        rst += 100;
                        break;
                    case 'D':
                        rst += 500;
                        break;
                    case 'M':
                        rst += 1000;
                        break;
                    
                }
            }
        }
        return rst;
    }
    
    private HashMap<String, Integer> createMap1() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("D", 500);
        map.put("C", 100);
        map.put("L", 50);
        map.put("X", 10);
        map.put("V", 5);
        map.put("I", 1);
        return map;
    }
    
    
}
