package com.xyzniu.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 412
 */
public class FizzBuzz {

    /**
     * 写一个程序，输出从 1 到 n 数字的字符串表示。
     * 1. 如果 n 是3的倍数，输出“Fizz”；
     * 2. 如果 n 是5的倍数，输出“Buzz”；
     * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
     *
     * @param n
     * @return
     */
    public List<String> fizzBuzz(int n) {
    	List<String> rst = new ArrayList<>();
    	for(int i = 1; i <= n; i++) {
    		if(i%15==0) {
    			rst.add("FizzBuzz");
    		}else if(i%5==0) {
    			rst.add("Buzz");
    		}else if(i%3==0) {
    			rst.add("Fizz");
    		}else {
    			rst.add(String.valueOf(i));
    		}
    	}
    	return rst;
    }
}
