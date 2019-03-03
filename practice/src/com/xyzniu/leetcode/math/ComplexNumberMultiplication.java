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
        String a1 = a.substring(0, a.indexOf('+'));
        String b1 = b.substring(0, b.indexOf('+'));
        String a2 = a.substring(a.indexOf('+') + 1, a.indexOf('i'));
        String b2 = b.substring(b.indexOf('+') + 1, b.indexOf('i'));
        int aa1 = change(a1);
        int aa2 = change(a2);
        int bb1 = change(b1);
        int bb2 = change(b2);
        int rst1 = aa1 * bb1 - aa2 * bb2;
        int rst2 = aa1 * bb2 + aa2 * bb1;
        return "" + rst1 + "+" + rst2 + "i";
    }

    private int change(String s) {
        boolean flag = true;
        if (s.startsWith("-")) {
            flag = false;
            s = s.substring(1);
        }
        int rst = Integer.valueOf(s);
        return flag ? rst : -1 * rst;
    }

}
