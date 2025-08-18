package main.java.com.samarth.revision;

import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {
    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character c : s.toLowerCase().toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (Character c : t.toLowerCase().toCharArray()) {
            if (hm.getOrDefault(c, 0) < 1) {
                return false;
            }
            hm.put(c, hm.getOrDefault(c, 0) - 1);
        }

        for (int i : hm.values()) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
