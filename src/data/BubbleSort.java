package data;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] list = {65, 55, 45, 35, 25, 15, 10};
        sort(list);
        System.out.println("Arrays.toString(list) = " + Arrays.toString(list));
    }

    static void sort(int[] list) {
        int unsortedUntilIndex = list.length - 1; // 6
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < unsortedUntilIndex; i++) { // 0 ~ 5
                if (list[i] > list[i + 1]) {
                    sorted = false;
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
            unsortedUntilIndex -= 1;
        }
    }

}
