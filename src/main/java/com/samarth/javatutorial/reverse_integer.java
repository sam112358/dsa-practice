package main.java.com.samarth.javatutorial;

import java.util.Arrays;
import java.util.HashMap;

public class reverse_integer {
    public static void main(String[] args) {
        int num = 1534236469;
        int output = reverse_integer_solution.solution(num);
        System.out.println(output);
    }
}

class reverse_integer_solution {
    static int solution(int x){
        int prevRev = 0 , rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            if((rev - x % 10) / 10 != prevRev){
                return 0;
            }
            prevRev = rev;
            x= x/10;
        }
        return rev;
    }
}