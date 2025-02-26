package main.java.com.samarth.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {4,1,-1,2,-1,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
            map.put(i, map.get(i) + 1);
        }

        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
        arr.sort((a,b) -> map.get(b) - map.get(a));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}
