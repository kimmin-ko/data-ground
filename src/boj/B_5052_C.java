package boj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class B_5052_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String[] strings = new String[n];

            for (int j = 0; j < n; j++)
                strings[j] = scanner.next();

            boolean valid = solution(strings);
            System.out.println(valid ? "YES": "NO");
        }
    }

    public static boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook, Comparator.comparingInt(String::length));

        HashMap<String, String> map = new HashMap<>();

        for (String phoneNumber : phoneBook) {
            for (int i = phoneBook[0].length(); i <= phoneNumber.length(); i++) {
                String key = phoneNumber.substring(0, i);

                if(map.get(key) != null)
                    return false;

                if(key.equals(phoneNumber))
                    map.put(key, "");
            }
        }

        return true;
    }

}
