package com.xyzniu.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225
 */
public class ImplementStackUsingQueues {


}


class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.offer(x);
    }

    public int pop() {
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int rst = queue1.poll();
        queue1 = queue2;
        queue2 = new LinkedList<>();
        return rst;
    }

    public int top() {
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int rst = queue1.poll();
        queue1 = queue2;
        queue1.offer(rst);
        queue2 = new LinkedList<>();
        return rst;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
