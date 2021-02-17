package leetcode;

import java.util.Arrays;

public class Easy_1742_C {

    public static void main(String[] args) {
        int result = countBalls(1, 992);

        System.out.println("result = " + result);
    }

    public static int countBalls(int lowLimit, int highLimit) {
        int[] res = new int[46];

        for (int i = lowLimit; i <= highLimit; i++) {
            res[sum(i)]++;
        }

        return Arrays.stream(res).max().getAsInt();
    }

    public static int bestPractice(int lowLimit, int highLimit) {
        int[] cnt = new int[46];
        int max = 0;
        for (int i = lowLimit; i <= highLimit; ++i) {
            int num = i, sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            max = Math.max(++cnt[sum], max);
        }
        return max;
    }



    public static int sum(int i) {
        if (i < 10) {
            return i;
        } else if (i < 100) {
            int x = i / 10;
            int y = i - (x * 10);
            return x + sum(y);
        } else if (i < 1000) {
            int x = i / 100;
            int y = i - (x * 100);
            return x + sum(y);
        } else if (i < 10000) {
            int x = i / 1000;
            int y = i - (x * 1000);
            return x + sum(y);
        } else if (i < 100000) {
            int x = i / 10000;
            int y = i - (x * 10000);
            return x + sum(y);
        } else if (i < 1000000) {
            int x = i / 100000;
            int y = i - (x * 100000);
            return x + sum(y);
        } else {
            throw new IllegalArgumentException(i + "는 잘못된 값 입니다.");
        }
    }

}
