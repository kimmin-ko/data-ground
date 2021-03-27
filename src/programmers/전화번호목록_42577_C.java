package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class 전화번호목록_42577_C {

    public static void main(String[] args) {
        String[] phone_book = {"12356","12357","567","119273263", "119"};
        boolean result = solution(phone_book);
        System.out.println("result = " + result);
    }

    public static boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook, Comparator.comparingInt(String::length));

        Map<String, String> map = new HashMap<>();

        for (String value : phoneBook) {
            for (int i = phoneBook[0].length(); i <= value.length(); i++) {
                String key = value.substring(0, i);

                if (map.get(key) != null)
                    return false;

                if(value.equals(key)) // 이 코드가 빠지면 123456을 돌 때 123, 1234, 12345, 123456이 모두 등록됨
                    map.put(key, "");
            }
        }

        return true;
    }

}
