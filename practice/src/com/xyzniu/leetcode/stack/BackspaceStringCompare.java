package com.xyzniu.leetcode.stack;

import java.util.Stack;

/**
 * 844
 */
public class BackspaceStringCompare {
    
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = generateStack(S);
        Stack<Character> stackT = generateStack(T);
        return compareStack(stackS, stackT);
        
    }
    
    private boolean compareStack(Stack<Character> stackS, Stack<Character> stackT) {
        if (stackS.size() != stackT.size()) {
            return false;
        }
        while (!stackS.empty() && !stackT.empty()) {
            if (stackS.pop() != stackT.pop()) {
                return false;
            }
        }
        return true;
    }
    
    private Stack<Character> generateStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '#':
                    if (!stack.empty()) {
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(s.charAt(i));
                    break;
            }
        }
        return stack;
    }
    
}
