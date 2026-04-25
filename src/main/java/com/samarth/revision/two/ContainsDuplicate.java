package main.java.com.samarth.revision.two;


import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();
        int[] nums = {3,3};
        System.out.println(sol.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            if (!s.add(n)) return true;
        }
        return false;
    }
}
