package main.java.com.samarth.javatutorial;

import java.util.HashMap;

/** Given a string without spaces, the task is to remove duplicates from it.

Note: The original order of characters must be kept the same.

Example 1:

Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first
occurrence

Example 2:

Input: S = "gfg"
Output: gf
Explanation: Only keep the first
occurrence

Your task:
Your task is to complete the function removeDups() which takes a single string as input and returns the string. You need not take any input or print anything.


Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(constant)

Constraints:
1 <= |S| <= 105
S conatins lowercase english alphabets **/

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "gfg";
        System.out.println(solution(str));
    }

    static String solution(String S){
        StringBuilder strb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < S.length(); i++){
            if(!map.containsKey(String.valueOf(S.charAt(i)))){
                map.put(String.valueOf(S.charAt(i)), 1);
                strb.append(S.charAt(i));
            }
        }
        return strb.toString();
    }

}
