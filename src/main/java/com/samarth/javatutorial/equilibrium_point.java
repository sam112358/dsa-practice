package main.java.com.samarth.javatutorial;

//Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array.
//        Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
//
//        Example 1:
//
//        Input:
//        n = 5
//        A[] = {1,3,5,2,2}
//        Output: 3
//        Explanation: For second test case
//        equilibrium point is at position 3
//        as elements before it (1+3) =
//        elements after it (2+2).
//
//
//
//        Example 2:
//
//        Input:
//        n = 1
//        A[] = {1}
//        Output: 1
//        Explanation:
//        Since its the only element hence
//        its the only equilibrium point.
//
//
//
//        Your Task:
//        The task is to complete the function equilibriumPoint() which takes the array and n as input parameters and returns the point of equilibrium. Return -1 if no such point exists.
//
//        Expected Time Complexity: O(n)
//        Expected Auxiliary Space: O(1)
//
//        Constraints:
//        1 <= n <= 106
//        1 <= A[i] <= 108

public class equilibrium_point {
    public static void main(String[] args) {
        int[] arr = {26, 26};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr){

        int n = arr.length;
        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum

        /* Find sum of the whole array */
        for (int ele : arr)
            sum += ele;

        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index i

            if (leftsum == sum)
                return i;

            leftsum += arr[i];
        }

        /* If no equilibrium index found, then return 0 */
        return -1;
    }
}
