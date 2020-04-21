package com.xyzniu.leetcode;

public class OddCells {
    
    public int oddCells(int n, int m, int[][] indices) {
        int[][] rst = new int[n][m];
        
        for (int i = 0; i < indices.length; i++) {
            addRow(rst, indices[i][0]);
            addList(rst, indices[i][1]);
        }
        
        int count = 0;
        for (int i = 0; i < rst.length; i++) {
            for (int j = 0; j < rst[0].length; j++) {
                if (rst[i][j] % 2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }
    
    private void addList(int[][] rst, int index) {
        for (int i = 0; i < rst.length; i++) {
            rst[i][index]++;
        }
    }
    
    private void addRow(int[][] rst, int index) {
        for (int i = 0; i < rst[0].length; i++) {
            rst[index][i]++;
        }
    }
}
