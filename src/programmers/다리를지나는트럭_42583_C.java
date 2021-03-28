package programmers;

import java.util.LinkedList;

public class 다리를지나는트럭_42583_C {

    public static void main(String[] args) {
        int result = solution(2, 10, new int[]{7, 4, 5, 6});
        System.out.println("result = " + result);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int second = 0;

        LinkedList<Integer> bridge = new LinkedList<>(); // 다리

        for (int i = 0; i < bridge_length; i++) // 다리의 길이 만큼 0으로 채워 넣음
            bridge.add(0);

        int truck_weights_on_bridge = 0; // 다리를 건너고 있는 트럭의 무게 합
        for (int i = 0; i < truck_weights.length; i++) { // 트럭의 개수 만큼 반복
            second++; // 시간 증가

            int truck_weight = truck_weights[i]; // 현재 트럭의 무게
            truck_weights_on_bridge -= bridge.remove(); // 도착한 트럭을 다리에서 제거하고 다리 위의 트럭 무게에서 빼줌
            if ((truck_weights_on_bridge + truck_weight) <= weight) { // 다리 위의 무게와 현재 트럭의 무게가 다리가 버틸 수 있는 무게보다 낮은지 확인
                bridge.add(truck_weight); // 낮다면 다음 트럭이 올라올 수 있기때문에 다리에 트럭 추가
                truck_weights_on_bridge += truck_weight; // 현재 다리 위의 무게에 트럭 무게 추가
            } else {
                i--; // 현재 트럭이 다리 무게 초과로 올라오지 못하면 다시 시도해야하기때문에 i 값 1 감소
                bridge.add(0); // 트럭이 올라오지 못한 자리를 0으로 채움
            }

            System.out.println("bridge = " + bridge + ", second = " + second);
        }

        return second + bridge_length; // 마지막 트럭이 다리를 건넌 시간을 더해줌
    }

}