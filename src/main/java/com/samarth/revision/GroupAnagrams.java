package main.java.com.samarth.revision;

import java.util.*;

public class GroupAnagrams {
    public static void main(String args[]) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedChars = new String(arr);
            if (!map.containsKey(sortedChars)) {
                map.put(sortedChars, new ArrayList<>());
            }
            map.get(sortedChars).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
