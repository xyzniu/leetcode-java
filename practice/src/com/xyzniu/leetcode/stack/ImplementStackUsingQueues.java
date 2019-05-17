package com.xyzniu.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225
 */
public class ImplementStackUsingQueues {
}


class MyStack {
	
	Queue<Integer> q1;
	Queue<Integer> q2;
	
    public MyStack() {
    	 q1 = new LinkedList<>();
    	 q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(!q2.isEmpty()) {
        	q2.offer(x);
        }else {
        	q1.offer(x);
        }
    }
    
    public int pop() {
        return adjust(true);
    }
    
    private int adjust(boolean pop) {
    	Queue<Integer> qin, qout;
    	if(q1.isEmpty()) {
    		qin = q1;
    		qout = q2;
    	}else {
    		qin = q2;
    		qout = q1;
    	}
    	
    	while(qout.size()!=1) {
    		qin.offer(qout.poll());
    	}

    	int val = qout.poll();
    	if(!pop) {
    		qin.offer(val);
    	}
    	return val;

	}

	public int top() {
		return adjust(false);
    }
    
    public boolean empty() {
        return q1.isEmpty()&&q2.isEmpty();
    }
}