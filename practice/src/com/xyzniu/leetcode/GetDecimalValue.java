package com.xyzniu.leetcode;

public class GetDecimalValue {
    private class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
            val = x;
        }
    }
    
    
    public int getDecimalValue(ListNode head) {
        int number = 0;
        while (head != null) {
            number *= 2;
            number += head.val;
            head = head.next;
        }
        return number;
    }
}
