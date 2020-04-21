package com.xyzniu.leetcode;

import com.xyzniu.leetcode.linkedlist.ListNode;

import java.util.Stack;

public class ReversePrint {
    
    
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        
        int[] rst = new int[stack.size()];
        int index = 0;
        while (!stack.empty()) {
            rst[index++] = stack.pop();
        }
        return rst;
    }
}
