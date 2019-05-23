package com.xyzniu.leetcode.dfs;

public class FloodFill {
    private int oldColor;
    private int newColor;
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.oldColor = image[sr][sc];
        this.newColor = newColor;
        if (oldColor != newColor) {
            fill(image, sr, sc);
        }
        return image;
    }
    
    private void fill(int[][] image, int sr, int sc) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc > image[0].length) {
            return;
        }
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            fill(image, sr + 1, sc);
            fill(image, sr - 1, sc);
            fill(image, sr, sc + 1);
            fill(image, sr, sc - 1);
        }
    }
    
}
