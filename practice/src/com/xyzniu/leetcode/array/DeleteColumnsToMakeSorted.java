package com.xyzniu.leetcode.array;

/**
 * 944
 */
public class DeleteColumnsToMakeSorted {
    /**
     * 给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。
     * 选取一个删除索引序列，对于 A 中的每个字符串，删除对应每个索引处的字符。 所余下的字符串行从上往下读形成列。
     * 比如，有 A = ["abcdef", "uvwxyz"]，删除索引序列 {0, 2, 3}，删除后 A 为["bef", "vyz"]， A 的列分别为["b","v"], ["e","y"], ["f","z"]。（形式上，第 n 列为 [A[0][n], A[1][n], ..., A[A.length-1][n]]）。
     * 假设，我们选择了一组删除索引 D，那么在执行删除操作之后，A 中所剩余的每一列都必须是 非降序 排列的，然后请你返回 D.length 的最小可能值。
     **/
    public int minDeletionSize(String[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int count = 0;
        int len = A[0].length();
        for (int i = 0; i < len; i++) {
            char prev = A[0].charAt(i);
            boolean flag = true;
            for (int j = 1; j < A.length; j++) {
                if (A[j].charAt(i) < prev) {
                    flag = false;
                    break;
                } else {
                    prev = A[j].charAt(i);
                }
            }
            if (!flag) {
                count++;
            }
        }
        return count;
    }
    
}
