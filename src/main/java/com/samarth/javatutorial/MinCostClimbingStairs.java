package main.java.com.samarth.javatutorial;

/* 746. Min Cost Climbing Stairs
Easy
Topics
Companies
Hint

You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.



Example 1:

Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.

Example 2:

Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.



Constraints:

    2 <= cost.length <= 1000
    0 <= cost[i] <= 999

 */

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] n = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(n));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] arr = new int[len];

        for (int i=0; i<len; i++) {
            if (i < 2) {
                arr[i] = cost[i];
            } else {
                arr[i] = cost[i] + Math.min(arr[i-1], arr[i-2]);
            }
        }

        return Math.min(arr[len-1], arr[len-2]);
    }
}
