package com.xyzniu.leetcode;

import java.util.Stack;

public class MyQueue {
    
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int count;
    
    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        count = 0;
    }
    
    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
        count++;
    }
    
    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        count--;
        if (!stack2.empty()) {
            return stack2.pop();
        }
        adjust();
        return stack2.pop();
    }
    
    /**
     * Get the front element.
     */
    public int peek() {
        if (!stack2.empty()) {
            return stack2.peek();
        }
        adjust();
        return stack2.peek();
    }
    
    private void adjust() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
    }
    
    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return count == 0;
    }
    
}
