package com.xyzniu.leetcode;

public class MinTimeToVisitAllPoints {
    
    public int minTimeToVisitAllPoints(int[][] points) {
        int distance = 0;
        for (int i = 0; i < points.length - 1; i++) {
            distance += distance(points[i], points[i + 1]);
        }
        return distance;
    }
    
    private int distance(int[] point1, int[] point2) {
        return Math.max(Math.abs(point1[0] - point2[0]), Math.abs(point1[1] -point2[1]));
    }
}
