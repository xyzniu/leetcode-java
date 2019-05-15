package com.xyzniu.leetcode.math;

/**
 * 171
 */
public class ExcelSheetColumnNumber {
    
    /**
     * 给定一个Excel表格中的列名称，返回其相应的列序号。
     *
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum *= 26;
            sum += (s.charAt(i) - 'A' + 1);
        }
        return sum;
    }
}
