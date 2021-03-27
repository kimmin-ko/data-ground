package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 위장_42578_C {

    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int result = solution(clothes);
        System.out.println("result = " + result);
    }

    public static int solution(String[][] clothes) {
        int result = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes)
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);

        for (int value : map.values())
            result *= value + 1;

        return result - 1;
    }

}
