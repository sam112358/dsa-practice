package main.java.com.samarth.revision.two;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch sol = new BinarySearch();
        int[] nums = {2};
        int target = 2;
        System.out.println(sol.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
