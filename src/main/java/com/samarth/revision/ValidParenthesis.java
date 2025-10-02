package main.java.com.samarth.revision;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "((";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() % 2 != 0)
            return false;
        for (Character ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(')');
            } else if (ch == '{') {
                st.push('}');
            } else if (ch == '[') {
                st.push(']');
            } else if (st.isEmpty() || st.pop() != ch) {
                return false;
            }
        }
        return st.isEmpty();
    }
}
