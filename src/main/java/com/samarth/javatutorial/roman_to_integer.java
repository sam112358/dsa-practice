package main.java.com.samarth.javatutorial;

import java.util.HashMap;

public class roman_to_integer {
    public static void main(String[] args) {
        String roman = "LVIII";
        int output = solution(roman);
        System.out.println(output);
    }

    public static int solution(String roman){
        char[] arr = roman.toCharArray();
        HashMap<Character, Integer> values = new HashMap<Character, Integer>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int sum = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(values.get(arr[i]) < values.get(arr[i + 1]))
                sum -= values.get(arr[i]);
            else
                sum += values.get(arr[i]);
        }
        sum += values.get(arr[arr.length - 1]);
        return sum;
    }
}