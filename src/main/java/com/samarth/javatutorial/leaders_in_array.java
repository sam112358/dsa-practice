package main.java.com.samarth.javatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class leaders_in_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};
        ArrayList<Integer> sol = solution(arr);
        for(int ele: sol)
            System.out.println(ele);
    }

    static ArrayList<Integer> solution(int[] arr){
        int n = arr.length - 1;
        ArrayList<Integer> sol = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = n; i > 0; i--){
            if(arr[i] >= max){
                sol.add(arr[i]);
                max = arr[i];
            }
        }
        sol.sort(Collections.reverseOrder());
        return sol;
    }
}
