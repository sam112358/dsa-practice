package main.java.com.samarth.javatutorial;

import java.util.ArrayList;
import java.util.HashMap;

public class count_the_triplets {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int[] myIntArray = {1,5,3,2};
        int output = count_the_triplets_solution.countTheTriplets(myIntArray, myIntArray.length);
        System.out.println(output);
    }
}

class count_the_triplets_solution{
    static int countTheTriplets(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int temp: arr){
            map.put(temp, 1);
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int sum = arr[i] + arr[j];
                if(map.containsKey(sum)){
                    count += 1;
                }
            }
        }
        return count;
    }
}
