package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 프린터_42587_C {

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int result = solution(priorities, location);
        System.out.println("result = " + result);
    }

    public static int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>(); // 우선순위의 인덱스 값을 저장할 큐
        for (int i = 0; i < priorities.length; i++)
            queue.add(i); // 우선순위의 인덱스를 큐에 순서대로 저장

        System.out.println("queue = " + queue);

        int count = 0; // 프린터의 출력 카운트
        while (!queue.isEmpty()) { // 큐가 모두 없어질 때까지 반복

            boolean flag = false; // 우선순위가 더 큰 값이 있으면 true 없으면 false
            for (int priority : priorities) {
                // 큐의 인덱스로 우선순위 꺼내서 배열에 더 큰 값이 있는지 검사함
                if (priorities[queue.peek()] < priority) { // 우선순위가 더 큰 값이 있다면
                    flag = true; // 플래그 true 변경
                    break; // 검사 종료
                }
            }

            if (flag) { // 더 우선순위가 높은게 있으면
                queue.add(queue.remove()); // 큐를 꺼내서 뒤로 보냄
            } else { // 없으면
                count++; // 출력 순서 1만큼 증가
                final int printerIndex = queue.remove(); // 프린터를 출력하고 인덱스 추출
                priorities[printerIndex] = 0; // 해당 프린터는 인쇄 되었으므로 우선순위 0으로 변경
                if (printerIndex == location) // 출력하는 프린터의 인덱스와 location 값이 같으면 출력 순서 반환
                    return count;
            }
        }

        return count;
    }
}