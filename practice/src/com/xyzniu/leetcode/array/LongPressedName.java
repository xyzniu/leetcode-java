package com.xyzniu.leetcode.array;

/**
 * 925
 */
public class LongPressedName {
    
    public boolean isLongPressedName(String name, String typed) {
        int index1 = 0;
        int index2 = 0;
        char c = typed.charAt(0);
        while (index1 < name.length()) {
            while (index2 < typed.length() && typed.charAt(index2) != name.charAt(index1) && typed.charAt(index2) == c) {
                index2++;
            }
            if (index2 >= typed.length()) {
                return false;
            } else if (typed.charAt(index2) == name.charAt(index1)) {
                index1++;
                c = typed.charAt(index2++);
            } else {
                return false;
            }
        }
        return true;
    }
    
    
    
}
