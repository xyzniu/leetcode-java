package com.xyzniu.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
}

class RecentCounter {
    
    private Queue<Integer> queue;
    
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.offer(t);
        while (queue.peek()<t-3000){
            queue.poll();
        }
        return queue.size();
    }
}