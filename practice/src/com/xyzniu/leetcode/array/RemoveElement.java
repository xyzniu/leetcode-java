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
        int index = 0;
        int i = 0;
        while (i < nums.length) {
            while (i < nums.length && nums[i] == val) {
                i++;
            }
            if (i < nums.length) {
                nums[index++] = nums[i++];
            }
        }
        return index;
    }
}
