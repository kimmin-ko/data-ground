package data;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 3};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int position = i;
            int temp = array[i];

            while (position > 0 && array[position - 1] > temp) {
                array[position] = array[position - 1];
                position -= 1;
            }

            array[position] = temp;
        }
    }

}
