package data;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {65, 55, 45, 35, 25, 15, 10};
        sort(array);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }

    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lowestNumberIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[lowestNumberIndex])
                    lowestNumberIndex = j;

                if (lowestNumberIndex != i) {
                    int temp = array[i];
                    array[i] = array[lowestNumberIndex];
                    array[lowestNumberIndex] = temp;
                }
            }

        }
    }
}
