package main.java.com.samarth.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int len = nums.length;
        int[] ans = new int[len*2];
        for(int i = 0; i < len; i++) {
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        return ans;
    }
}
