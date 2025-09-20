package main.java.com.samarth.revision;

import java.util.*;

public class GroupAnagrams {
    public static void main(String args[]) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for(String s: strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String sorted = Arrays.toString(temp);
            if (!hm.containsKey(sorted)) {
                hm.put(sorted, new ArrayList<>());
            }
            hm.get(sorted).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
