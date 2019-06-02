package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 997
 */
public class FindTheTownJudge {
    
    class Entry {
        boolean trustOther;
        int otherTrust;
        
        Entry() {
            trustOther = false;
            otherTrust = 0;
        }
        
    }
    
    public int findJudge(int N, int[][] trust) {
        List<Entry> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(new Entry());
        }
        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];
            list.get(a - 1).trustOther = true;
            list.get(b - 1).otherTrust++;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).otherTrust == N - 1 && !list.get(i).trustOther) {
                return i + 1;
            }
        }
        return -1;
    }
    
    
}
