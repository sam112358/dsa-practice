package main.java.com.samarth.revision.three;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "))";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> st = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(')');
            } else if (ch == '[') {
                st.push(']');
            } else if (ch == '{') {
                st.push('}');
            } else {
                if (st.empty() || st.pop() != ch) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
