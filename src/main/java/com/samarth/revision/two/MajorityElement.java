package main.java.com.samarth.revision.two;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement sol = new MajorityElement();
        int[] nums = {1};
        System.out.println(sol.majorityElementOn1(nums));
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int majority = nums.length / 2;
        for (int n : nums) {
            int freq = hm.getOrDefault(n, 0) + 1;
            if (freq > majority) return n;
            hm.put(n, freq);
        }
        return -1;
    }
    
//    we keep adding to majority if same element and subtracting if different element
//    cur element changes only when majority reaches 0. last remaining in cur is returned
    public int majorityElementOn1(int[] nums) {
        int majority = 0;
        int cur = 0;

        for (int n : nums) {
            if (majority == 0) cur = n;
            majority += n == cur ? 1 : -1;
        }
        return cur;
    }
}
