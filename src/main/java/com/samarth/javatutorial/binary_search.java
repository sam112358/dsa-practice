package main.java.com.samarth.javatutorial;

import java.util.ArrayList;

public class binary_search {
    public static void main(String[] args) {
        int[] myIntArray = {1,2,4,5,6,10,15};
        int searchNum = 10;
        int output = binary_search_solution.search(myIntArray, 0, myIntArray.length - 1, searchNum);
        System.out.println(output);
    }
}

class binary_search_solution {
    static int search(int[] arr, int start, int end, int searchNum){
        if(start < end){
            int mid = start + (end - start)/ 2;
            if(arr[mid] == searchNum){
                return mid;
            }

            if(arr[mid] > searchNum){
                return search(arr, start, mid - 1, searchNum);
            }
            else{
                return search(arr, mid + 1, end, searchNum);
            }
        }

        return -1;
    }
}