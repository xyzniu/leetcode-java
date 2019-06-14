package com.xyzniu.leetcode.math;

/**
 * 836
 */
public class RectangleOverlap {
    private int left;
    private int right;
    private int bottom;
    private int top;
    
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        left = rec1[0];
        right = rec1[2];
        bottom = rec1[1];
        top = rec1[3];
        int[][] points = new int[][]{
                {rec2[0], rec2[1]},
                {rec2[0], rec2[3]},
                {rec2[2], rec2[1]},
                {rec2[2], rec2[3]},
        };
        for (int i = 0; i < points.length; i++) {
            if (overlap(points[i][0], points[i][1])) {
                return false;
            }
        }
        return true;
    }
    
    private boolean overlap(int x, int y) {
        if (left < x && x < right && bottom < y && y < top) {
            return true;
        }
        return false;
    }
    
}
