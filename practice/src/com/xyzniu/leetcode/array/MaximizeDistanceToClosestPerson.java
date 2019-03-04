package com.xyzniu.leetcode.array;

/**
 * 849
 */
public class MaximizeDistanceToClosestPerson {
    /**
     * 在一排座位（ seats）中，1 代表有人坐在座位上，0 代表座位上是空的。
     * 至少有一个空座位，且至少有一人坐在座位上。
     * 亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。
     * 返回他到离他最近的人的最大距离。
     *
     * @param seats
     * @return
     */
    public int maxDistToClosest(int[] seats) {
        int left = 0;
        int right = seats.length - 1;
        int max = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != 1) {
                left++;
            } else {
                break;
            }
        }
        for (int i = right; i >= 0; i--) {
            if (seats[i] != 1) {
                right--;
            } else {
                break;
            }
        }
        max = Math.max(left, seats.length - right - 1);
        if (left == seats.length) {
            return max;
        }
        int temp = 0;
        for (int i = left; i <= right; i++) {
            if (seats[i] == 1) {
                max = Math.max(max, (temp + 1) / 2);
                temp = 0;
            } else {
                temp++;
            }
        }
        return max;
    }
}
