package main.java.com.samarth.revision;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = Integer.MIN_VALUE;
        int currMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currMax += 1;
            } else {
                if (currMax > maxConsecutive)
                    maxConsecutive = currMax;
                currMax = 0;
            }
            if (currMax > maxConsecutive)
                maxConsecutive = currMax;
        }
        return maxConsecutive;
    }
}
