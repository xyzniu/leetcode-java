package com.xyzniu.leetcode.linkedlist;

public class MiddleOfTheLinkedList {
    
    public ListNode middleNode(ListNode head) {
        ListNode one = head;
        ListNode two = head;
        
        while (two !=null && two.next!=null){
            two = two.next.next;
            one = one.next;
        }
        return one;
    }
}
