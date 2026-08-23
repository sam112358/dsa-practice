package main.java.com.samarth.revision.two;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        RansomNote sol = new RansomNote();
        String ransomeNote = "aa";
        String magazine = "ab";
        System.out.println(sol.canConstruct2(ransomeNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character ch : magazine.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : ransomNote.toCharArray()) {
            if (!hm.containsKey(ch)) return false;
            if (hm.get(ch) < 1) {
                return false;
            } else {
                hm.put(ch, hm.get(ch) - 1);
            }
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] counts = new int[26];
        for (char c : magazine.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (--counts[c - 'a'] < 0) return false;
        }
        return true;
    }
}
