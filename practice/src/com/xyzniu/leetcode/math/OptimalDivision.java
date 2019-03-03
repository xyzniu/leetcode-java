package com.xyzniu.leetcode.math;

/**
 * 553
 */
public class OptimalDivision {

    /**
     * 给定一组正整数，相邻的整数之间将会进行浮点除法操作。例如， [2,3,4] -> 2 / 3 / 4 。
     * 但是，你可以在任意位置添加任意数目的括号，来改变算数的优先级。你需要找出怎么添加括号，才能得到最大的结果，并且返回相应的字符串格式的表达式。你的表达式不应该含有冗余的括号。
     *
     * @param nums
     * @return
     */
    public String optimalDivision(int[] nums) {
        StringBuffer sb = new StringBuffer();
        sb.append(nums[0]);
        if (nums.length == 1) {
            return sb.toString();
        }
        if (nums.length == 2) {
            sb.append("/");
            sb.append(nums[1]);
            return sb.toString();
        }
        sb.append("/(");
        for (int i = 1; i < nums.length; i++) {
            sb.append(nums[i] + "/");
        }
        sb.delete(sb.length() - 1, sb.length());
        sb.append(")");
        return sb.toString();
    }
}
