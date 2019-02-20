package com.xyzniu.leetcode.array;

/**
 * 867
 */
public class TransposeMatrix {


    /**
     * 给定一个矩阵 A， 返回 A 的转置矩阵。
     * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
     *
     * 执行用时：4ms
     * 内存消耗：34MB
     * @param A
     * @return
     */
    public int[][] transpose(int[][] A) {
        int ilen = A.length;
        int jlen = A[0].length;
        int[][] rst = new int[jlen][ilen];

        for (int i = 0; i < ilen; i++) {
            for (int j = 0; j < jlen; j++) {
                rst[j][i] = A[i][j];
            }
        }
        return rst;
    }

}
