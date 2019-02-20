package com.xyzniu.leetcode.array;

/**
 * 566
 */
public class ReshapeTheMatrix {

    /**
     * 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
     * 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
     * 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
     * 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
     *
     * 执行用时：7ms
     * 内存消耗：41MB
     *
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int ilen = nums.length;
        int jlen = nums[0].length;
        if (ilen * jlen != r * c) {
            return nums;
        }
        int[][] rst = new int[r][c];
        int iindex = 0;
        int jindex = 0;
        for (int i = 0; i < ilen; i++) {
            for (int j = 0; j < jlen; j++) {
                rst[iindex][jindex] = nums[i][j];
                jindex++;
                if (jindex == c) {
                    jindex = 0;
                    iindex++;
                }
            }
        }
        return rst;
    }
}
