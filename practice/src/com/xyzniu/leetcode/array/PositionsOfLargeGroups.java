package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 830
 */
public class PositionsOfLargeGroups {
    
    
    public List<List<Integer>> largeGroupPositions(String S) {
        if (S == null || S.length() < 3) {
            return new ArrayList<>();
        }
        char prev = S.charAt(0);
        int start = 0;
        List<List<Integer>> rst = new ArrayList<>();
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != prev) {
                if (i - start >= 3) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(i - 1);
                    rst.add(list);
                }
                start = i;
                prev = S.charAt(i);
            }
        }
        if (S.length() - start >= 3) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(start);
            list.add(S.length() - 1);
            rst.add(list);
        }
        return rst;
    }
    
}
