package com.xyzniu.leetcode.math;

/**
 * 693
 */
public class BinaryNumberWithAlternatingBits {


    /**
     * 给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
     *
     * @param n
     * @return
     */
    public boolean hasAlternatingBits(int n) {
    	String sb = Integer.toBinaryString(n);
    	boolean isOne = true;
    	for(int i = 0; i < sb.length(); i++) {
    		if(isOne && sb.charAt(i)=='1') {
    			isOne = false;
    		}else if(!isOne && sb.charAt(i)=='0') {
    			isOne = true;
    		}else {
    			return false;
    		}
    	}
    	return true;
    }

}
