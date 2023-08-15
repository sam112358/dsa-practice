package main.java.com.samarth.javatutorial;

import java.util.ArrayList;

public class rearrange_array_alternatively {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int[] myIntArray = {1,2,3,4,5,6};
        int[] output = rearrange_array_alternatively_solution.rearrange(myIntArray, myIntArray.length);
        System.out.println(output);
    }
}

class rearrange_array_alternatively_solution {
    static int[] rearrange(int arr[], int n){
        int i = 0;
        int j = n-1;
        int max = arr[j] + 1;
        while(i < n){
            arr[i] = arr[i] + (arr[j] * max);
            i += 1;
            j -= 1;
        }

        for(i = 0; i < n; i ++){
            if(i % 2 == 0){
                arr[i] = arr[i] / max;
            }
            else{
                arr[i] = arr[i] % max;
            }
        }
        return arr;
    }
}