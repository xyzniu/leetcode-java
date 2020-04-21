package com.xyzniu.leetcode;

public class Game {
    
    public int game(int[] guess, int[] answer) {
        int count = 0;
        if (guess != null && guess.length > 0) {
            
            for (int i = 0; i < guess.length; i++) {
                if (guess[i] == answer[i]) {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
    
}
