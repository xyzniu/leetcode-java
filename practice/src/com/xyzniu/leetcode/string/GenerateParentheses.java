package com.xyzniu.leetcode.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 22
 */
public class GenerateParentheses {
    
    public List<String> generateParenthesis(int n) {
        HashSet<String> set = generateParenthesis(n, new HashSet<String>());
        List<String> rst = new ArrayList<>();
        for (String str : set) {
            rst.add(str);
        }
        return rst;
    }
    
    private HashSet<String> generateParenthesis(int n, HashSet<String> set) {
        if (n == 0) {
            return set;
        }
        
        if (set.isEmpty()) {
            set.add("()");
        } else {
            HashSet<String> temp = new HashSet<>();
            for (String str : set) {
                temp.add("()" + str);
                temp.add(str + "()");
                temp.add("(" + str + ")");
            }
            set = temp;
        }
        
        return generateParenthesis(n - 1, set);
    }
    
    
    public static void main(String[] args) {
        String[] strings = new String[]{};
        String[] strings1 = new String[]{ "(())(())"};
    }
}
