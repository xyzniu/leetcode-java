package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 830
 */
public class PositionsOfLargeGroups {


    /**
     * 在一个由小写字母构成的字符串 S 中，包含由一些连续的相同字符所构成的分组。
     * 例如，在字符串 S = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
     * 我们称所有包含大于或等于三个连续字符的分组为较大分组。找到每一个较大分组的起始和终止位置。
     * 最终结果按照字典顺序输出。
     *
     * 在后面拼一个大写字符就不需要处理结尾的特殊情况了
     *
     * @param S
     * @return
     */
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> rst = new ArrayList<>();
        if (S == null || S.length() == 0) {
            return rst;
        }
        S = S + "A";

        char prev = S.charAt(0);
        int start = 0;
        int end = start;

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == prev) {
                end = i;
            } else {
                if (end - start >= 2) {
                    List<Integer> row = new ArrayList<>();
                    row.add(start);
                    row.add(end);
                    rst.add(row);
                }
                prev = S.charAt(i);
                start = i;
                end = i;
            }
        }
        return rst;
    }

}
