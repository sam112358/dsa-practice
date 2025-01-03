package main.java.com.samarth.revision;

import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {
    public static void main(String args[]) {
        String s = "aacc";
        String t = "ccac";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mp = new HashMap<>();
        for(Character c: s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c,0) + 1);
        }

        for (Character c: t.toCharArray()) {
            if (!mp.containsKey(c)) {
                return false;
            } else {
                if (mp.get(c) == 1) {
                    mp.remove(c);
                } else {
                    mp.put(c, mp.get(c)-1);
                }
            }
        }

        return mp.isEmpty();
    }
}
