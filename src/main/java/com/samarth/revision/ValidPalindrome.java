package main.java.com.samarth.revision;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        char[] chars = s.toLowerCase().toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(chars[i])) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(chars[j])) {
                j--;
            }

            if (i >= j) {
                break;
            }

            if (chars[i] != chars[j]) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
