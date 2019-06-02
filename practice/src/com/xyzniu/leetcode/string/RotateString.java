package com.xyzniu.leetcode.string;

/**
 * 796
 */
public class RotateString {
    
    public boolean rotateString(String A, String B) {
        if (A == null && B == null) {
            return true;
        } else if (A.length() != B.length()) {
            return false;
        } else if (A.equals(B)) {
            return true;
        }
        char c = B.charAt(0);
        int start = A.indexOf(c);
        while (start > 0) {
            if (isSame(A, B, start)) {
                return true;
            } else {
                start = A.indexOf(c, start + 1);
            }
        }
        return false;
    }
    
    private boolean isSame(String A, String B, int start) {
        int index1 = start;
        int index2 = 0;
        while (index2 < B.length()) {
            if (A.charAt(index1) != B.charAt(index2)) {
                return false;
            }
            index1++;
            index2++;
            if (index1 >= A.length()) {
                index1 = 0;
            }
        }
        return true;
    }
    
}
