package main.java.com.samarth.revision;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {4,1,-1,2,-1,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> keys = new ArrayList<>(hm.keySet());
        keys.sort((a, b) -> (hm.get(b) - hm.get(a)));

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = keys.get(i);
        }
        return res;
    }
}
