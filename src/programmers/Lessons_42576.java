package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Lessons_42576 {

    public static void main(String[] args) {
        String[] participant = {"eden", "leo", "kiki", "eden"};
        String[] completion = {"eden", "leo", "kiki"};
        String result = solution(participant, completion);

        // eden
        System.out.println("result = " + result);
    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            int count = 0;
            Integer value = map.get(player);
            if(value != null)
                count = value;

            map.put(player, ++count);
        }

        for (String player : completion) {
            Integer value = map.get(player);
            if(value == 1)
                map.remove(player);
            else
                map.put(player, --value);
        }

        return map.keySet().iterator().next();
    }
}
