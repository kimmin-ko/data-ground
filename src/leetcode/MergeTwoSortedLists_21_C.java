package leetcode;

public class MergeTwoSortedLists_21_C {

    public static void main(String[] args) {
        ListNode l1_4 = new ListNode(4);
        ListNode l1_2 = new ListNode(2, l1_4);
        ListNode l1_1 = new ListNode(1, l1_2);

        ListNode l2_4 = new ListNode(4);
        ListNode l2_3 = new ListNode(3, l2_4);
        ListNode l2_1 = new ListNode(1, l2_3);

        ListNode result = mergeTwoLists(l1_1, l2_1);
        print(result);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fakeNode = new ListNode(-1);
        ListNode lastNode = fakeNode;

        // 1 2 4
        // 1 3 4
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                lastNode.next = l1;
                lastNode = l1;
                l1 = l1.next;
            } else {
                lastNode.next = l2;
                lastNode = l2;
                l2 = l2.next;
            }
        }

        if (l1 != null)
            lastNode.next = l1;

        if (l2 != null)
            lastNode.next = l2;

        return fakeNode.next;
    }

    private static void print(ListNode node) {
        System.out.print(node.val + " ");
        if (node.next == null)
            return;

        print(node.next);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
