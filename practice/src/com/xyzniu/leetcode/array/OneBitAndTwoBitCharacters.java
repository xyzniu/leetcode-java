package com.xyzniu.leetcode.array;

/**
 * 717
 */
public class OneBitAndTwoBitCharacters {
    
    public boolean isOneBitCharacter(int[] bits) {
        int index = 0;
        while (index < bits.length - 1) {
            if (bits[index] == 1) {
                index += 2;
            } else {
                index += 1;
            }
        }
        if (index == bits.length - 1) {
            return true;
        } else {
            return false;
        }
    }
}
