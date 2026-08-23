package main.java.com.samarth.revision.two;

import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome sol = new LongestPalindrome();
        String s = "abcd";
        System.out.println(sol.longestPalindrome(s));
    }

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int total = 0;
        boolean foundOdd = false;
        for (int v : hm.values()) {
            if (v % 2 == 0)
                total += v;
            else {
                total += (v - 1);
                foundOdd = true;
            }
        }
        if (foundOdd) total += 1;
        return total;
    }

    public int longestPalindrome2(String s) {
        int oddCount = 0;
        int[] counts = new int[128];

        for (char ch : s.toCharArray()) {
            counts[ch]++;
            if (counts[ch] % 2 == 1) oddCount++;
            else oddCount--;
        }
        if (oddCount > 0) {
            return s.length() - oddCount + 1;
        }
        return s.length();
    }
}
