package main.java.com.samarth.javatutorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/*Given a matrix of size m*n, m denotes the row starting with index 0 and n denotes the column starting with index 0.

The matrix will hold distinct integers as elements.

We need to find a distinct number of positional elements which are either the minimum or maximum in their corresponding row or column.

Please return -1 if any row or any column has multiple minimum or maximum elements.

For example, given a matrix of size 3*3, the elements are stored as follows.

1  3  4
5  2  9
8  7  6

The expected output is 7.

In the above example, we identified the output as 7 based on below.

1 - minimum in row and column
4 - Maximum in row
2 - Minimum in column and row
9 - Maximum in row and column
8 - Maximum in row and column
7 - Maximum in column
6 - Minimum in row

Input:

m - integer - number of rows
n - integer - number of columns
m * n matrix

Output:

r - integer - result

Constraints:

0<m,n<100
Elements in the matrix are positive integers.*/

public class special_elements_in_matrix {
    public static void main(String[] args) {
        int [][] input = new int[][]{{1,3,4}, {5,2,9}, {8,7,6}};
        int n = input.length;
        int m = input[0].length;
        int output = special_elements_in_matrix_solution.solution(input, n, m);
        System.out.println(output);
    }
}

class special_elements_in_matrix_solution {
    static int solution(int[][] arr, int n, int m){
        int rowmax[] = new int[m];
        int rowmin[] = new int[m];
        int colmax[] = new int[n];
        int colmin[] = new int[n];

        for(int i = 0; i < n; i++){
            int rmin = Integer.MAX_VALUE;
            int rmax = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++){
                if(arr[i][j] > rmax)
                    rmax = arr[i][j];
                if(arr[i][j] < rmin)
                    rmin = arr[i][j];
            }
            rowmax[i] = rmax;
            rowmin[i] = rmin;
        }

        for(int j = 0; j < m; j++){
            int cmin = Integer.MAX_VALUE;
            int cmax = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                if(arr[i][j] > cmax)
                    cmax = arr[i][j];
                if(arr[i][j] < cmin)
                    cmin = arr[i][j];
            }
            colmax[j] = cmax;
            colmin[j] = cmin;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((arr[i][j] == rowmax[i])
                        || (arr[i][j] == rowmin[i])
                        || (arr[i][j] == colmax[j])
                        || (arr[i][j] == colmin[j])) {
                    count++;
                }
            }
        }

        return count;
    }
}