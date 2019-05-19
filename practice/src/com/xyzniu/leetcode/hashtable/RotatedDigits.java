package com.xyzniu.leetcode.hashtable;

import java.util.HashSet;

public class RotatedDigits {
    
    public int rotatedDigits(int N) {
        HashSet<Character> set1 = createSet2();
        HashSet<Character> set2 = createSet1();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            String str = String.valueOf(i);
            boolean b = true;
            boolean b2 = false;
            for (int j = 0; j < str.length(); j++) {
                if (!set1.contains(str.charAt(j))) {
                    b = false;
                    break;
                }
                if (set2.contains(str.charAt(j))) {
                    b2 = true;
                }
            }
            if (b && b2) {
                sum++;
            }
        }
        return sum;
    }
    
    private HashSet<Character> createSet1() {
        HashSet<Character> set = new HashSet<>();
        set.add('2');
        set.add('5');
        set.add('6');
        set.add('9');
        return set;
    }
    
    private HashSet<Character> createSet2() {
        HashSet<Character> set = new HashSet<>();
        set.add('0');
        set.add('1');
        set.add('8');
        set.add('2');
        set.add('5');
        set.add('6');
        set.add('9');
        return set;
    }
    
}
