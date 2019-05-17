package com.xyzniu.leetcode.stack;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 496
 * 
 * 1, 3, 4, 2
 * 1, 3, 4, 2
 * 1, 2, 3, 4
 * 
 * 
 * @author xinyueniu
 *
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] rst = new int[nums1.length];
        int[] nums = Arrays.copyOf(nums1, nums1.length);
        quickSort(nums1, 0, nums1.length-1);
        quickSort(nums2, 0, nums2.length-1);
        HashMap<Integer, Integer> map = new HashMap<>();
        int index1 = 0, index2 = 0;
        for(; index1<nums1.length; index1++) {
        	while(index2 < nums2.length && nums1[index1]>=nums2[index2]) {
        		index2++;
        	}
        	if(index2>=nums2.length) {
        		map.put(nums1[index1], -1);
        	}else {
        		map.put(nums1[index1], nums2[index2]);
        	}
        }
        
        for(int i = 0; i < nums.length; i++) {
        	rst[i] = map.get(nums[i]);
        }
        return rst;
    }

	private void quickSort(int[] nums, int start, int end) {
		if(start>=end) {
			return;
		}
		
		int one = start;
		int left = start+1;
		int right = end;
		int mid;
		
		while(left<right) {
			while(left<right && nums[left]<=nums[one]) {
				left++;
			}
			while(left<right && nums[right]>=nums[one]) {
				right--;
			}
			if(left<right) {
				swap(nums, left, right);
			}
		}
		
		if(nums[left]<nums[one]) {
			swap(nums, left, one);
			mid = left;
		}else {
			swap(nums, left-1, one);
			mid = left-1;
		}
		quickSort(nums, start, mid-1);
		quickSort(nums, mid+1, end);
	}
	
	private void swap(int[]nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public static void main(String[] args) {
		NextGreaterElementI n = new NextGreaterElementI();
n.nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2});
	}
}
