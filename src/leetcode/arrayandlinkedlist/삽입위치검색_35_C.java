package leetcode.arrayandlinkedlist;

import java.util.Arrays;

public class 삽입위치검색_35_C {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 3;
        int result = searchInsert(nums, target);
        System.out.println("result = " + result);
    }

    public static int searchInsert(int[] nums, int target) {
        // 정렬된 배열이기 때문에 이진 정렬을 사용할 수 있음
        // 해당 메서드는 찾는 값이 없을 경우 -(들어가야할 인덱스) - 1 을 반환함
        int i = Arrays.binarySearch(nums, target);

        // 리턴 인덱스가 음수라면 해당 값에 1을 더해주고 절대 값을 반환함
        if (i < 0)
            i = Math.abs(i + 1);

        return i;
    }

}
