package main.java.com.samarth.revision;

import java.util.Arrays;

public class TwoSum2SortedInputArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length-1;

        while(nums[l] + nums[r] != target) {
            if (nums[l] + nums[r] > target)
                r--;
            else
                l++;
        }

        return new int[]{l+1,r+1};
    }
}
