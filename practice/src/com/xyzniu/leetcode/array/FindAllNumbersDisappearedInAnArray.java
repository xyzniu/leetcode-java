package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 448
 */
public class FindAllNumbersDisappearedInAnArray {

    /**
     * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
     * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
     * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        return findDisappearedNumbers1(nums);
    }

    public List<Integer> findDisappearedNumbers1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        List<Integer> rst = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                rst.add(i);
            }
        }
        return rst;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }

        List<Integer> rst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                rst.add(i + 1);
            }
        }
        return rst;
    }
}
