package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Easy_13_C {

    public static void main(String[] args) {
        String s = "D"; // 1695
        int result = romanToInt(s);

        System.out.println("result = " + result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        if(s.length() == 0)
            return 0;
        else if(s.length() == 1)
            return map.get(s.charAt(0));

        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            int value = map.get(s.charAt(i - 1));
            int nextVal = map.get(s.charAt(i));

            if (nextVal > value) {
                value = nextVal - value;
                i++;
            }

            result += value;

            if(i == s.length() - 1)
                result += map.get(s.charAt(i));
        }

        return result;
    }

}
