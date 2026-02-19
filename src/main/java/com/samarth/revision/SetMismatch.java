package main.java.com.samarth.revision;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[]  findErrorNums(int[] nums) {
        int n = nums.length;
        int expectedTotal = n * (n + 1) / 2;
        int actualTotal = 0;
        int uniqueTotal = 0;
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            s.add(i);
            actualTotal += i;
        }
        for (int i : s) {
            uniqueTotal += i;
        }
        return new int[]{actualTotal - uniqueTotal, expectedTotal - uniqueTotal};
    }
}
