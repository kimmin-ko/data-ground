package leetcode.arrayandlinkedlist;

public class ListNodeUtil {

    public static void print(ListNode node) {
        System.out.print(node.val + " ");
        if (node.next == null)
            return;

        print(node.next);
    }

}
