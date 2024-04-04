package main.java.com.samarth.javatutorial;

/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {5};
        int target = 5;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int i = (start + end) / 2;
            if (nums[i] == target)
                return i;
            else if (nums[i] < target)
                start = i + 1;
            else if (nums[i] > target)
                end = i - 1;
        }
        return -1;
    }
}
