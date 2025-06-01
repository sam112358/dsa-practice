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
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Character i : t.toCharArray()) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) - 1);
            } else {
                return false;
            }
        }
        for (int i : map.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
