package com.xyzniu.leetcode.array;

/**
 * 027
 */
public class RemoveElement {


    /**
     * Q:
     * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     * <p>
     * A:
     * 双指针，可以向后扫，也可以向前扫，'元素顺序可以改变'就在暗示这个把哈哈
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        return removeElement2(nums, val);
    }

    /**
     * 执行用时：9ms
     * 内存消耗：29MB
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement1(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (i < j && nums[i] != val) {
                i++;
            }
            while (i < j && nums[j] == val) {
                j--;
            }
            if (i < j) {
                nums[i] = nums[j];
                nums[j] = val;
            }
        }
        if (nums[i] == val) {
            return i;
        } else {
            return i + 1;
        }
    }

    /**
     * 执行用时：9ms
     * 内存消耗：29MB
     * @param nums
     * @param val
     * @return
     */
    public int removeElement2(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
            i++;
        }
        return index + 1;
    }
}
