package com.xyzniu.leetcode.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author xinyueniu
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums2) {
            while (!stack.empty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            
            stack.push(num);
        }
        
        int[] rst = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            rst[i] = map.getOrDefault(nums1[i], -1);
        }
        return rst;
    }
}
