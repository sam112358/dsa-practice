package main.java.com.samarth.revision.two;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram sol = new ValidAnagram();
        String s = "abcs";
        String t = "sabc";
        System.out.println(sol.isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int i : counts) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
