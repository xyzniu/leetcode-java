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
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode rst = new ListNode(0);
        ListNode head = rst;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                rst.next = list2;
                list2 = list2.next;
            } else {
                rst.next = list1;
                list1 = list1.next;
            }
            rst = rst.next;
        }

        if (list1 != null) {
            rst.next = list1;
        }
        if (list2 != null) {
            rst.next = list2;
        }
        return head.next;
    }

}
