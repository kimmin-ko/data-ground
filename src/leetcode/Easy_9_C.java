package leetcode;

public class Easy_9_C {

    public static void main(String[] args) {
        int x = 121;

        boolean palindrome = isPalindrome(x);
        System.out.println("result = " + palindrome);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        else if (x < 10) return true;

        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return x == rev || x == rev / 10;
    }

}
