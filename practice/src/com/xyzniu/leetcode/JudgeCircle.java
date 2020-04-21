package com.xyzniu.leetcode;

public class JudgeCircle {
    
    public boolean judgeCircle(String moves) {
        int u = 0;
        int l = 0;
        
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    u++;
                    break;
                case 'D':
                    u--;
                    break;
                case 'L':
                    l++;
                    break;
                case 'R':
                    l--;
                    break;
            }
        }
        return u == 0 && l == 0;
    }
    
}
