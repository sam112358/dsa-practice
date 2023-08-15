package main.java.com.samarth.javatutorial;

import java.util.Stack;

/*Reduce the string by removing K consecutive identical characters

Difficulty Level : Medium
Last Updated : 21 Jul, 2021

Given a string str and an integer K, the task is to reduce the string by applying the following operation any number of times until it is no longer possible:

Choose a group of K consecutive identical characters and remove them from the string.

Finally, print the reduced string.

Examples:

Input: K = 2, str = “geeksforgeeks”
Output: gksforgks
Explanation: After removal of both occurrences of the substring “ee”, the string reduces to “gksforgks”.


Input: K = 3, str = “qddxxxd”
Output: q
Explanation:
Removal of “xxx” modifies the string to “qddd”.
Again, removal of “ddd”modifies the string to “q”.*/

public class array_burst_problem {
    public static void main(String[] args) {
        String input = "abcccdde";
        String output = array_burst_problem_solution.solution(input.length(), input, 3);
        System.out.println(output);
    }
}

class array_burst_problem_solution {
    static String solution(int len, String arr, int burst){
        Stack<Pair> st = new Stack<>();

        for(int i = 0; i < len; i++){
            if(st.size() == 0){
                st.push(new Pair(arr.charAt(i), 1));
                continue;
            }

            if(st.peek().c == arr.charAt(i)){
                Pair p = st.peek();
                st.pop();
                p.ctr += 1;
                if(p.ctr == burst){
                    continue;
                }
                else{
                    st.push(p);
                }
            }
            else{
                st.push(new Pair(arr.charAt(i), 1));
            }
        }

        String output = "";
        while(st.size() != 0){
            char c = st.peek().c;
            int ctr = st.peek().ctr;
            while(ctr --> 0){
                output = c + output;
            }
            st.pop();
        }
        return output;
    }

    static class Pair{
        char c;
        int ctr;
        Pair(char c, int ctr){
            this.c = c;
            this.ctr = ctr;
        }
    }
}