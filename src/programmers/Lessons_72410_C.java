package programmers;

import java.util.LinkedList;
import java.util.List;

public class Lessons_72410_C {

    public static void main(String[] args) {
        String id = solution("123_.def");
        System.out.println("id = " + id);
    }

    public static String solution(String newId) {
        // 1 대문자 -> 소문자 치환
        newId = newId.toLowerCase();

        // 2 소문자, 숫자, -, _, . 제외 모든 문자 제거
        newId = newId.replaceAll("[^a-z0-9-_.]", "");

        // 3 ........ -> .
        newId = newId.replaceAll("\\.+", ".");

        // 4
        newId = removeSideDot(newId);

        // 5
        if (newId.equals(""))
            newId = "a";

        // 6
        if (newId.length() >= 16) {
            newId = newId.substring(0, 15);
            newId = removeSideDot(newId);
        }

        // 7
        while (newId.length() < 3)
            newId += newId.charAt(newId.length() - 1);

        return newId;
    }

    private static String removeSideDot(String newId) {
        if (newId.startsWith("."))
            newId = newId.substring(1);

        if (newId.endsWith("."))
            newId = newId.substring(0, newId.length() - 1);

        return newId;
    }

}
