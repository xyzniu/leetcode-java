package com.xyzniu.leetcode.sort;

/**
 * 1046
 */
public class LastStoneWeight {
    
    public int lastStoneWeight(int[] stones) {
        quicksort(stones, 0, stones.length - 1);
        int index = stones.length - 1;
        while (index != 0) {
            int firstWeight = stones[index];
            int secondWeight = stones[index - 1];
            if (firstWeight == secondWeight) {
                index -= 2;
            } else {
                index--;
                stones[index] = firstWeight - secondWeight;
                insertsort(stones, index);
            }
        }
        return stones[0];
    }
    
    private void insertsort(int[] stones, int index) {
        while (index > 0) {
            if (stones[index] < stones[index - 1]) {
                swap(stones, index, index - 1);
                index--;
            } else {
                break;
            }
        }
    }
    
    private void quicksort(int[] stones, int start, int end) {
        if (start >= end) {
            return;
        }
        int one = start;
        int left = start + 1;
        int right = end;
        
        while (left < right) {
            while (left < right && stones[left] <= stones[one]) {
                left++;
            }
            while (left < right && stones[right] >= stones[one]) {
                right--;
            }
            if (left < right) {
                swap(stones, left, right);
                left++;
                right--;
            }
        }
        int mid;
        if (stones[one] < stones[left]) {
            mid = left - 1;
        } else {
            mid = left;
        }
        swap(stones, mid, one);
        quicksort(stones, start, mid - 1);
        quicksort(stones, mid + 1, end);
    }
    
    private void swap(int[] stones, int i, int j) {
        int temp = stones[i];
        stones[i] = stones[j];
        stones[j] = temp;
    }
    
    
}
