package com.xyzniu.leetcode.stack;

import java.util.Stack;

public class RemoveOutermostParentheses {
    
    public String removeOuterParentheses(String S) {
        int start = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    stack.pop();
                    break;
            }
            if (stack.empty()) {
                sb.append(S.substring(start + 1, i));
                start = i + 1;
            }
        }
        return sb.toString();
    }
    
}
