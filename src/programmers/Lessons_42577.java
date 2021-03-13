package programmers;

import java.util.HashMap;
import java.util.Map;

public class Lessons_42577 {

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean result = solution(phone_book);
        System.out.println("result = " + result);
    }

    public static boolean solution(String[] phoneBook) {
        Map<String, Void> map = new HashMap<>();

        for (String phoneNumber : phoneBook)
            map.put(phoneNumber, null);

        // 하나라도 있으면 바로 리턴
        for (String key : map.keySet()) {
            for (String mappingKey : map.keySet()) {
                if (!key.equals(mappingKey) && key.startsWith(mappingKey)) {
                    return false;
                }
            }
        }
        
        return true;
    }

}
