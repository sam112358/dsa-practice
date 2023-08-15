package main.java.com.samarth.javatutorial;

//Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. Incase of conflict, return the substring which occurs first ( with the least starting index).
//
//
//Example 1:
//
//Input:
//S = "aaaabbaa"
//Output: aabbaa
//Explanation: The longest Palindromic
//substring is "aabbaa".
//
//Example 2:
//
//Input:
//S = "abc"
//Output: a
//Explanation: "a", "b" and "c" are the
//longest palindromes with same length.
//The result is the one with the least
//starting index.
//
//
//Your Task:
//You don't need to read input or print anything. Your task is to complete the function longestPalin() which takes the string S as input and returns the longest palindromic substring of S.
//
//
//Expected Time Complexity: O(|S|2).
//Expected Auxiliary Space: O(1).
//
//
//Constraints:
//1 ≤ |S| ≤ 103

public class longest_palindrome_in_string {
    public static void main(String[] args) {
        String arg = "aaaabbaa";
        solution(arg);
    }

    static void solution(String S){
        int n = S.length();
        if(n == 0){
            System.out.println("");
        }
        if(n == 1){
            System.out.println(S);
        }
        String longest = "";
        int longestLen = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                if(j - i > longestLen && isP(S.substring(i, j))){
                    longestLen = j - i;
                    longest = S.substring(i, j);
                }
            }
        }
        System.out.println(longest);
    }

    static Boolean isP(String arg){
        char[] iter = arg.toCharArray();
        int start = 0, end = arg.length()-1;
        while(start < end){
            if(iter[start] == iter[end]){
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }
}
