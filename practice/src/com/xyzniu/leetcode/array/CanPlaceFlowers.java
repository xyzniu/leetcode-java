package com.xyzniu.leetcode.array;

/**
 * 605
 */
public class CanPlaceFlowers {

    /**
     * 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
     * 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
     *
     * @param flowerbed
     * @param n
     * @return
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int left = 0;
        int right = flowerbed.length - 1;
        int rst = 0;
        for (; left < flowerbed.length; left++) {
            if (flowerbed[left] == 1) {
                break;
            }
        }
        rst = rst + left / 2;
        if (left == flowerbed.length) {
            if (rst >= n) {
                return true;
            }
        }

        for (; right >= left; right--) {
            if (flowerbed[right] == 1) {
                break;
            }
        }

        rst = rst + (flowerbed.length - right - 1) / 2;

        int prev = 0;
        for (int i = left; i <= right; i++) {
            if (flowerbed[i] == 1) {
                rst = rst + (prev - 1) / 2;
                prev = 0;
            } else {
                prev++;
            }
        }
        return rst >= n;
    }

}
