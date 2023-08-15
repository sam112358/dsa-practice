package main.java.com.samarth.javatutorial;

import java.util.Scanner;

public class state_of_wakanda {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] myIntArray = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                myIntArray[i][j] = scn.nextInt();
            }
        }
        state_of_wakanda_solution.path(myIntArray, n, m);
    }
}

class state_of_wakanda_solution {
    static void path(int[][] arr, int n, int m){
        int i = 0;
        int j = 0;
        int num = 1;
        for(j = 0; j < m; j++){
            while (i < n && i >= 0) {
                System.out.println(arr[i][j]);
                i += num;
            }
            num *= -1;
            i += num;
        }
    }
}