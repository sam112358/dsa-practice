package main.java.com.samarth.revision.two;

import java.util.HashMap;

public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs sol = new ClimbingStairs();
        int n = 3;
        System.out.println(sol.cimbingStairsSpaceOptimisation(n));
    }

    public int climbStairsMemoization(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        return climbStairsMemoization(n, hm);
    }

    private int climbStairsMemoization(int n, HashMap<Integer, Integer> hm) {
        if (n == 0 || n == 1) return 1;
        if (!hm.containsKey(n))
            hm.put(n, climbStairsMemoization(n-1, hm) + climbStairsMemoization(n-2, hm));
        return hm.get(n);
    }

    public int climbStairsDP(int n) {
        if (n == 0 || n == 1) return 1;

        int[] tab = new int[n+1];
        tab[0] = tab[1] = 1;
        for(int i = 2; i <= n; i++) {
            tab[i] = tab[i-1] + tab[i-2];
        }
        return tab[n];
    }

    public int cimbingStairsSpaceOptimisation(int n) {
        if (n == 0 || n == 1) return 1;

        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
        }
        return curr;
    }
}
