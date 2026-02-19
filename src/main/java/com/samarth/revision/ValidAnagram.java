package main.java.com.samarth.revision;

import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {
    public static void main(String args[]) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character i : s.toCharArray()) {
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        for (Character i : t.toCharArray()) {
            if (!hm.containsKey(i))
                return false;
            else {
                hm.put(i, hm.get(i)-1);
            }
        }
        for (int i: hm.values()) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
