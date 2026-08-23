package main.java.com.samarth.revision.two;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(sol.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i <= nums.length; i++){
            if (hm.containsKey(target - nums[i]))
                return new int[]{i, hm.get(target - nums[i])};
            else {
                hm.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
