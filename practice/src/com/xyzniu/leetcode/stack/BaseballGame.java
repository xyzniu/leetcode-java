package com.xyzniu.leetcode.stack;

import java.util.Stack;

/**
 * 682
 */
public class BaseballGame {
    
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            String str = ops[i];
            int num = 0;
            if (str.equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.peek();
                stack.push(num1);
                num = num1 + num2;
                stack.push(num);
            } else if (str.equals("D")) {
                num = stack.peek() * 2;
                stack.push(num);
            } else if (stack.equals("C")) {
                num = -1 * stack.pop();
            } else {
                num = Integer.parseInt(str);
                stack.push(num);
            }
            sum += num;
        }
        return sum;
    }
}
