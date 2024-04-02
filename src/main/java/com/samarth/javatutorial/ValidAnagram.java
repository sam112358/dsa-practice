package main.java.com.samarth.javatutorial;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false



Constraints:

    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.



Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

 */

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) - 1);
        }

        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
