package com.xyzniu.leetcode.math;

/**
 * 492
 */
public class ConstructTheRectangle {
    
    public int[] constructRectangle(int area) {
        int sqrt = (int) Math.sqrt(area);
        int[] rectangle = new int[2];
        while (area % sqrt != 0) {
            sqrt--;
        }
        rectangle[0] = area / sqrt;
        rectangle[1] = sqrt;
        return rectangle;
    }
    
}
