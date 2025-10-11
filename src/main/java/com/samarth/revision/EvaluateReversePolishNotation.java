package main.java.com.samarth.revision;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int total = 0;

        while(i < tokens.length) {
            String curr = tokens[i];
            if(!(curr.equals("+") || curr.equals("-") || curr.equals("*") || curr.equals("/"))) {
                st.push(Integer.valueOf(curr));
            } else {
                int v1 = st.pop();
                int v2 = st.pop();
                st.push(applyOperator(v1, v2, curr));
            }
            i++;
        }
        return st.pop();
    }

    public static int applyOperator(int v1, int v2, String op) {
        switch (op) {
            case "+" -> {
                return v2 + v1;
            }
            case "-" -> {
                return v2 - v1;
            }
            case "*" -> {
                return v2 * v1;
            }
            case "/" -> {
                return v2 / v1;
            }
        }
        return 0;
    }
}
