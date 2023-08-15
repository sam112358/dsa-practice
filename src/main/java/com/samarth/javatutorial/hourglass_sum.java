package main.java.com.samarth.javatutorial;

//Given a 2D Array,
//
//        :
//
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//
//        An hourglass in
//        is a subset of values with indices falling in this pattern in
//
//        's graphical representation:
//
//        a b c
//        d
//        e f g
//
//        There are
//        hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. The array will always be
//
//        .
//
//        Example
//
//        -9 -9 -9  1 1 1
//        0 -9  0  4 3 2
//        -9 -9 -9  1 2 3
//        0  0  8  6 6 0
//        0  0  0 -2 0 0
//        0  0  1  2 4 0
//
//        The
//
//        hourglass sums are:
//
//        -63, -34, -9, 12,
//        -10,   0, 28, 23,
//        -27, -11, -2, 10,
//        9,  17, 25, 18
//
//        The highest hourglass sum is
//        from the hourglass beginning at row , column
//
//        :
//
//        0 4 3
//        1
//        8 6 6
//
//        Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.
//
//        Function Description
//
//        Complete the function hourglassSum in the editor below.
//
//        hourglassSum has the following parameter(s):
//
//        int arr[6][6]: an array of integers
//
//        Returns
//
//        int: the maximum hourglass sum
//
//        Input Format
//
//        Each of the
//        lines of inputs contains space-separated integers .

import java.util.ArrayList;
import java.util.List;

public class hourglass_sum {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        System.out.println(hourglasssum(arr));
//        arr.add(List);
    }

    public static int hourglasssum(List<List<Integer>> arr){
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < arr.size()-1; i++){
            for(int j = 1; j < arr.size()-1; j++) {
                max = Math.max(max, checkHourGlass(i, j, arr));
            }
        }
        return max;
    }

    public static int checkHourGlass(int i, int j, List<List<Integer>> arr){
        return arr.get(i).get(j) + arr.get(i-1).get(j) + arr.get(i-1).get(j+1) + arr.get(i-1).get(j-1) + arr.get(i+1).get(j) + arr.get(i+1).get(j+1) + arr.get(i+1).get(j-1);
    }
}
