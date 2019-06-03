package com.xyzniu.leetcode.array;

import java.util.List;

/**
 * 1030
 *
 * 太强行了Orz
 */
public class MatrixCellsInDistanceOrder {
    private int r0;
    private int c0;
    
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        this.r0 = r0;
        this.c0 = c0;
        int[][] rst = new int[R * C][2];
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                rst[index][0] = i;
                rst[index][1] = j;
                index++;
            }
        }
        quicksort(rst, 0, R * C - 1);
        return rst;
    }
    
    private void quicksort(int[][] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int one = start;
        int left = start + 1;
        int right = end;
        while (left < right) {
            while (left < right && distance(array[left]) <= distance(array[one])) {
                left++;
            }
            while (left < right && distance(array[right]) >= distance(array[one])) {
                right--;
            }
            if (left < right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        int mid;
        if (distance(array[left]) < distance(array[one])) {
            mid = left;
        } else {
            mid = left - 1;
        }
        swap(array, mid, one);
        quicksort(array, start, mid - 1);
        quicksort(array, mid + 1, end);
    }
    
    private void swap(int[][] array, int i, int j) {
        int[] temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private int distance(int[] a) {
        return Math.abs(a[0] - r0) + Math.abs(a[1] - c0);
    }
    
    
}
