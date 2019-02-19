package com.xyzniu.leetcode.array;

/**
 * 832
 */
public class FlippingAnImage {

    /**
     * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
     * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
     * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
     *
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage(int[][] A) {
        return flipAndInvertImage1(A);
    }

    /**
     * 执行用时：8ms
     * 内存消耗：31MB
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage1(int[][] A) {
        for (int[] row : A) {
            if (row == null) {
                continue;
            }
            for (int i = 0, j = row.length - 1; i < j; i++, j--) {
                if (row[i] == row[j]) {
                    continue;
                }
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
            for (int i = 0; i < row.length; i++) {
                row[i] = row[i] ^ 1;
            }
        }
        return A;
    }
}
