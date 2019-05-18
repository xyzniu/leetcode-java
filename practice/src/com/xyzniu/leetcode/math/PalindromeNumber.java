package com.xyzniu.leetcode.math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 9
 */
public class PalindromeNumber {

    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for (int i = 0, j = str.length()-1; i < j; i++, j--) {
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
