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
        int width = A[0].length - 1;
        for (int i = 0; i < A.length; i++) {
            for (int left = 0, right = width; left < right; left++, right--) {
                if (A[i][left] == A[i][right]) {
                    continue;
                }
                int tmp = A[i][left];
                A[i][left] = A[i][right];
                A[i][right] = tmp;
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
}
