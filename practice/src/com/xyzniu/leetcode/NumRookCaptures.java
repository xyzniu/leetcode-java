package com.xyzniu.leetcode;

public class NumRookCaptures {
    
    public int numRookCaptures(char[][] board) {
        int[] rook = locate(board);
        int x = rook[0];
        int y = rook[1];
        
        int count = 0;
        boolean flag = true;
        for (int i = x; i < board.length && flag; i++) {
            switch (board[i][y]) {
                case 'B':
                    flag = false;
                    break;
                case 'p':
                    flag = false;
                    count++;
                    break;
            }
        }
        
        flag = true;
        for (int i = x; i >= 0 && flag; i--) {
            switch (board[i][y]) {
                case 'B':
                    flag = false;
                    break;
                case 'p':
                    flag = false;
                    count++;
                    break;
            }
        }
        flag = true;
        for (int i = y; i >= 0 && flag; i--) {
            switch (board[x][i]) {
                case 'B':
                    flag = false;
                    break;
                case 'p':
                    flag = false;
                    count++;
                    break;
            }
        }
        flag = true;
        for (int i = y; i < board[0].length && flag; i++) {
            switch (board[x][i]) {
                case 'B':
                    flag = false;
                    break;
                case 'p':
                    flag = false;
                    count++;
                    break;
            }
        }
        return count;
    }
    
    private int[] locate(char[][] board) {
        int[] rook = new int[2];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    rook[0] = i;
                    rook[1] = j;
                    return rook;
                }
            }
        }
        return rook;
    }
    
}
