package main.java.com.samarth.revision.two;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses sol = new ValidParentheses();
        String s = "{}";
        System.out.println(sol.isValid(s));
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (Character ch: s.toCharArray()){
            if (ch == '(')
                st.push(')');
            else if (ch == '[')
                st.push(']');
            else if (ch == '{') {
                st.push('}');
            } else if (st.isEmpty() || st.pop() != ch) {
                return false;
            }
        }
        return st.isEmpty();
    }
}
