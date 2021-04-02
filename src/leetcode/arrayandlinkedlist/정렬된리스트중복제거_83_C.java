package leetcode.arrayandlinkedlist;

public class 정렬된리스트중복제거_83_C {

    public static void main(String[] args) {
        ListNode data4 = new ListNode(3);
        ListNode data3 = new ListNode(3, data4);
        ListNode data2 = new ListNode(2, data3);
        ListNode data1 = new ListNode(1, data2);
        ListNode head = new ListNode(1, data1);
        ListNode result = deleteDuplicates(head);
        ListNodeUtil.print(result);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode result = head; // 해드 노드는 포인터를 옮겨가기 때문에 반환 할 첫 번째 노드를 저장시켜놓음

        while (head != null && head.next != null) { // 현재 노드와 다음 노드를 비교해야하기 때문에 null 이면 종료
            if (head.val == head.next.val) // 현재 값과 다음 값이 같으면
                head.next = head.next.next; // next는 다음 노드 대신 다다음 노드를 참조
            else // 값이 다르면
                head = head.next; // head 변수는 다음 노드를 참조
        }

        return result; // 첫 번째 노드 반환
    }

}
