package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Easy_13 {

    public static void main(String[] args) {
        String s = "XXVII";
        int result = romanToInt(s);

        System.out.println("result = " + result);
    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);



        return 0;
    }

}
