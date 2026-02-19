package main.java.com.samarth.revision;

import java.util.*;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] sorted = Arrays.stream(nums)
                .boxed()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
        for (int i = 0; i < n; i++) {
            hm.put(sorted[i], i);
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = hm.get(nums[i]);
        }
        return res;
    }
}
