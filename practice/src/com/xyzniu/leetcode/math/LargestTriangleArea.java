package com.xyzniu.leetcode.math;

/**
 * 812
 */
public class LargestTriangleArea {
    
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        for (int i = 0; i < points.length - 2; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            for (int j = i + 1; j < points.length - 1; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                for (int k = j + 1; k < points.length; k++) {
                    int x3 = points[k][0];
                    int y3 = points[k][1];
                    max = Math.max(max, Math.abs(x2 * y3 + x1 * y2 + x3 * y1 - x3 * y2 - x2 * y1 - x1 * y3));
                }
            }
        }
        max /= 2;
        return max;
    }
    
}
