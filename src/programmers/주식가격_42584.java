package programmers;

import java.util.Arrays;
import java.util.Stack;

public class 주식가격_42584 {

    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] result = solution(new int[]{1, 2, 3, 2, 3});
        System.out.println("exec = " + (System.nanoTime() - start));
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    public static int[] solution(int[] prices) {
        int[] result = new int[prices.length]; // 결과를 담을 배열

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) { // ex i번 인덱스 이후의 모든 인덱스와 비교를 해야함
                result[i]++; // 1초뒤에 가격이 떨어져도 1초간 가격이 떨어지지 않은 것으로 간주하기 때문에 일단 증가
                if (prices[i] > prices[j]) break; // 뒤에 값이 작으면 값이 떨어진것이기 때문에 반복 종료
            }
        }

        return result;
    }

    public static int[] solution1(int[] prices) {
        Stack<Integer> beginIdxs = new Stack<>();
        int i = 0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i = 1; i < prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }

        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
    }


}
