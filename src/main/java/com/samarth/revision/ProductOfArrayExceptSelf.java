package main.java.com.samarth.revision;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

//    we are calculating the left mult of all and then right mult of all then combining
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for(int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }

        return result;
    }
}
