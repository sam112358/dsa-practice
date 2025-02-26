package main.java.com.samarth.revision;

import java.util.*;

public class GroupAnagrams {
    public static void main(String args[]) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] sortedChars = s.toCharArray();
            Arrays.sort(sortedChars);
            String sortedWord = new String(sortedChars);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<String>());
            }
            map.get(sortedWord).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
