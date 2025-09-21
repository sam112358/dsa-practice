package main.java.com.samarth.revision;

import java.util.*;

public class LongestSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i:nums) {
            set.add(i);
        }

        int max = 0;

        for (int j : nums) {
            int count = 1;

            int num = j;
            while (set.contains(--num)) {
                set.remove(num);
                count++;
            }

            num = j;
            while (set.contains(++num)) {
                set.remove(num);
                count++;
            }

            max = Math.max(count, max);
        }
        return max;
    }
}
