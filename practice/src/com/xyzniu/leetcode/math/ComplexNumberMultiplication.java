package com.xyzniu.leetcode.math;

/**
 * 537
 */
public class ComplexNumberMultiplication {
    
    /**
     * 给定两个表示复数的字符串。
     * 返回表示它们乘积的字符串。注意，根据定义 i2 = -1 。
     *
     * @param a
     * @param b
     * @return
     */
    public String complexNumberMultiply(String a, String b) {
        int[] aa = toString(a);
        int[] bb = toString(b);
        StringBuffer sb = new StringBuffer();
        sb.append(aa[0] * bb[0] - aa[1] * bb[1]);
        sb.append("+");
        sb.append(aa[0] * bb[1] + aa[1] * bb[0]);
        sb.append("i");
        return sb.toString();
    }
    
    private int[] toString(String s) {
        int[] rst = new int[2];
        String[] strs = s.split("\\+");
        rst[0] = Integer.valueOf(strs[0]);
        rst[1] = Integer.valueOf(strs[1].substring(0, strs[1].length() - 1));
        return rst;
    }
    
    
    
}
