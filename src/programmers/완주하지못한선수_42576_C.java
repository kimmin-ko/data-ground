package programmers;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수_42576_C {

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
            Integer value = map.get(player); // map.get(player) "eden"

            if(value != null) // 이름이 중복일 경우
                count = value; // 1

            map.put(player, ++count); // 1 + 1 = 2
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
