package com.xyzniu.leetcode.stack;

import java.nio.charset.Charset;
import java.util.Stack;

/**
 * 1047
 */
public class RemoveAllAdjacentDuplicatesInString {
    
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (stack.empty()) {
                stack.push(c);
                continue;
            }
            
            if (stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuffer sb = new StringBuffer();
        if (!stack.empty()) {
            Character[] characters = stack.toArray(new Character[0]);
            for (int i = 0; i < characters.length; i++) {
                sb.append(characters[i]);
            }
        }
        return sb.toString();
    }
    
    
}
