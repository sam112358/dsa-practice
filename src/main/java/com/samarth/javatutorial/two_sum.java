package main.java.com.samarth.javatutorial;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;

public class two_sum {
    public static void main(String[] args) {
        int[] myIntArray = {2,7,11,15};
        int target = 9;
        int[] output = solution(myIntArray, target);
        System.out.println(Arrays.toString(output));
    }

    public static int[] solution(int @NotNull [] nums, int target) {
        HashMap<Integer, Integer> inputs = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(inputs.containsKey(target - nums[i]))
                return new int[]{inputs.get(target - nums[i]), i};
            else
                inputs.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}