package main.java.com.samarth.javatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class sort_0_1_2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int[] myIntArray = {0, 2, 1, 2, 0};
        int[] output = sort012_2(myIntArray, myIntArray.length);
        System.out.println(Arrays.toString(output));
    }

    private static int[] sort012(int[] arr, int n)
    {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>(){{
            put(0, 0);
            put(1, 0);
            put(2, 0);
        }};

        for(int i: arr){
            if(i == 0)
                count.put(0, count.get(0) + 1);
            else if(i == 1)
                count.put(1, count.get(1) + 1);
            else
                count.put(2, count.get(2) + 1);
        }

        int i = 0;
        for(int j = 0; j < count.get(0); j++, i++){
            arr[i] = 0;
        }
        for(int j = 0; j < count.get(1); j++, i++){
            arr[i] = 1;
        }
        for(int j = 0; j < count.get(2); j++, i++){
            arr[i] = 2;
        }
        return arr;
    }

    private static int[] sort012_2(int[] a, int n){
        int low = 0;
        int high = n - 1;
        for(int i = low; i < n;){
            if(low >= high)
                break;
            if(a[i] == 0){
                int temp = a[i];
                a[i] = a[low];
                a[low] = temp;
                low++;
                i++;
            }
            else if(a[i] == 2){
                int temp = 2;
                a[i] = a[high];
                a[high] = 2;
                high--;
            }
            else
                i++;
        }
        return a;
    }
}

