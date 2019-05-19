package com.xyzniu.leetcode.linkedlist;

/**
 * 21
 */
public class MergeTwoSortedLists {
    
    /**
     * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode one = l;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                l.next = l2;
                l2 = l2.next;
            } else {
                l.next = l1;
                l1 = l1.next;
            }
            l = l.next;
        }
        if (l1 != null) {
            l.next = l1;
        } else {
            l.next = l2;
        }
        return one.next;
    }
    
}
