package leetcode.arrayandlinkedlist;

import java.util.ArrayList;

public class LinkedList순회_141 {

    public static void main(String[] args) {
        ListNode d3 = new ListNode(4);
        ListNode d2 = new ListNode(2, d3);
        ListNode d1 = new ListNode(0, d2);
        ListNode head = new ListNode(3, d1);
        boolean result = hasCycle(head);
        System.out.println("result = " + result);
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

}
