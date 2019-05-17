package com.xyzniu.leetcode.hashtable;

import java.util.*;

public class GroupsOfSpecialEquivalentStrings {
    
    public int numSpecialEquivGroups(String[] A) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            String str = A[i];
            List<String> row = map.getOrDefault(str.length(), new ArrayList<>());
            row.add(str);
            map.put(str.length(), row);
        }
        int sum = 0;
        for (int key : map.keySet()) {
            if (map.get(key).size() == 1) {
                sum += 1;
            } else {
                sum += count(map.get(key));
            }
        }
        return sum;
    }
    
    private int count(List<String> strings) {
        HashSet<String> set = new HashSet<>();
        for (String str : strings) {
            char[] chs = str.toCharArray();
            char[] odd = new char[chs.length / 2];
            char[] even = new char[(chs.length + 1) / 2];
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    even[i / 2] = chs[i];
                } else {
                    odd[i / 2] = chs[i];
                }
            }
            Arrays.sort(odd);
            Arrays.sort(even);
            String one = String.valueOf(even) + String.valueOf(odd);
            set.add(one);
        }
        return set.size();
    }
    
    
}
