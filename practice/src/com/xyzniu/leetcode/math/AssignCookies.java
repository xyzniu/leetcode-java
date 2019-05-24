package com.xyzniu.leetcode.math;

/**
 * 455
 */
public class AssignCookies {
    
    public int findContentChildren(int[] g, int[] s) {
        quicksort(g, 0, g.length - 1);
        quicksort(s, 0, s.length - 1);
        
        int factorIndex = 0;
        int sizeIndex = 0;
        int contentChildren = 0;
        
        while (factorIndex < g.length && sizeIndex < s.length) {
            while (sizeIndex < s.length && g[factorIndex] > s[sizeIndex]) {
                sizeIndex++;
            }
            if (sizeIndex < s.length && g[factorIndex] <= s[sizeIndex]) {
                contentChildren++;
                sizeIndex++;
                factorIndex++;
            }
        }
        return contentChildren;
    }
    
    private void quicksort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int one = array[start];
        int left = start + 1;
        int right = end;
        while (left < right) {
            while (left < right && array[left] < one) {
                left++;
            }
            while (left < right && array[right] > one) {
                right--;
            }
            if (left < right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        int mid;
        if (array[left] > one) {
            mid = left - 1;
        } else {
            mid = left;
        }
        swap(array, start, mid);
        quicksort(array, start, mid - 1);
        quicksort(array, mid + 1, end);
    }
    
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    
}
