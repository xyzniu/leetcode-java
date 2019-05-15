package com.xyzniu.leetcode.math;

/**
 * 521
 */
public class LongestUncommonSubsequenceI {
    
    public int findLUSlength(String a, String b) {
        if (a.length() == b.length() && a.equals(b)) {
            return -1;
        } else {
            return Math.max(a.length(), b.length());
        }
    }
}
