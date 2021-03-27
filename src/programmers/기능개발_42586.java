package programmers;

import java.util.*;

public class 기능개발_42586 {

    public static void main(String[] args) {
        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};
        int[] result = solution(progresses, speeds);
        System.out.println("result = " + Arrays.toString(result));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>(); // 각 기능을 개발하는데 걸리는 기간을 넣을 큐
        for (int i = 0; i < progresses.length; i++)
            // 올림 ((100 - 30) / 30) = 3
            queue.add((int) Math.ceil((100 - progresses[i]) / (double) speeds[i])); // 기능 개발 기간을 큐에 순서대로 넣음

        // 7, 3, 9
        System.out.println("queue = " + queue);

        int maxWorkDay = queue.remove(); // [최대 작업 기간] 첫 번째 기능 개발에 걸린 기간으로 초기화
        int count = 1; // [배포 될 기능의 개수] 첫 번째 기능을 제거했기 때문에 배포 될 기능도 1만큼 증가
        List<Object> result = new ArrayList<>(); // [결과를 저장 할 리스트]
        while (true) { // break;를 만날 때 까지 반복
            int workDay = queue.remove(); // 큐에서 기능 개발 기간을 꺼냄

            if (workDay <= maxWorkDay) { // 현재 작업 기간이 최대 작업 기간보다 작거나 같으
                count++; // 배포 될 기능을 1 만큼 추가하고 다음 작업 검사
            } else { // 현재 작업 기간이 최대 작업 기간보다 크다면
                result.add(count); // 이전까지의 배포될 기능 개수를 결과에 저장면
                maxWorkDay = workDay; // 최대 작업 기간을 현재 작업 기간으로 재할당
                count = 1; // 배포 될 기능도 1개로 재할당
            }

            if (queue.isEmpty()) { // 큐가 비어 있으면
                result.add(count); // 결과에 작업 개수를 저장
                break; // 반복 끝냄
            }
        }

        return result.stream().mapToInt(value -> (int) value).toArray();
    }
}
