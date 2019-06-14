package com.xyzniu.leetcode.stack;

import java.util.Stack;

/**
 * 20
 */
public class ValidParentheses {
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char c2 = stack.pop();
            if ((c == ')' && c2 == '(') || (c == '}' && c2 == '{') || (c == ']' && c2 == '[')) {
                continue;
            } else {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
}
