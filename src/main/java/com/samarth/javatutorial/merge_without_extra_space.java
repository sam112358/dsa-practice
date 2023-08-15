package main.java.com.samarth.javatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class merge_without_extra_space {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int[] myIntArray = {1,3,5,7};
        int[] myIntArray2 = {0,2,6,8,9};
        merge_without_extra_space_solution.merge(myIntArray, myIntArray2, myIntArray.length, myIntArray2.length);
    }
}

class merge_without_extra_space_solution{
    static void merge(int[] arr, int arr2[], int n, int m){
        int x = n - 1;
        int y = 0;
        while(x >=0 && y < m){
            if(arr[x] > arr2[y]){
                int j = arr[x];
                arr[x] = arr2[y];
                arr2[y] = j;
                x--;
                y++;
            }
            else{
                x--;
            }
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i:arr){
            System.out.println(i);
        }
        for(int i:arr2){
            System.out.println(i);
        }
    }
}
