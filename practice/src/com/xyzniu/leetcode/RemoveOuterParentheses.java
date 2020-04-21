package com.xyzniu.leetcode;

import java.util.Stack;

public class RemoveOuterParentheses {
    
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int prev = 0;
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    stack.pop();
                    break;
            }
            if (stack.isEmpty()) {
                sb.append(S.substring(prev + 1, i));
                prev = i + 1;
            }
        }
        return sb.toString();
    }
    
}
