package main.java.com.samarth.javatutorial;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.



Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

Example 4:

Input: s = "([)]"
Output: false

Example 5:

Input: s = "{[]}"
Output: true



Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.


 */

import java.util.HashMap;
import java.util.Stack;

public class valid_parentheses {
    public static void main(String[] args) {
        String s = "{[]}";
        boolean output = valid_parentheses_solution.solution(s);
        System.out.println(output);
    }
}

class valid_parentheses_solution {
    static boolean solution(String s){
        int n = s.length();
        HashMap<Character, Character> brackets = new HashMap<Character, Character>(){{
            put('{', '}');
            put('(', ')');
            put('[', ']');
            put('}', '1');
            put(')', '1');
            put(']', '1');
        }};
        Stack<Character> stk = new Stack<Character>();
        if(n == 0)
            return true;
        else if(n % 2 != 0)
            return false;
        else
            stk.push(s.charAt(0));

        for(int i = 1; i < n; i++){
            if(!stk.isEmpty() && brackets.get(stk.peek()) == s.charAt(i)){
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        if(stk.isEmpty())
            return true;
        else
            return false;
    }

    static boolean solution2(String s){
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}