package main.java.com.samarth.revision;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int n = 2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        int i = 0;
        int j = len/2;
        int k = 0;
        while (i < len/2) {
            ans[k] = nums[i];
            ans[k+1] = nums[j];
            k+=2;
            i++;
            j++;
        }
        return ans;
    }
}
