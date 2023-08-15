package main.java.com.samarth.javatutorial;

/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.



Constraints:

    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lower-case English letters.
*/

public class longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flo"};
        String encrypt = solution(strs);
        System.out.println("Longest common prefix : " + encrypt);
    }

    public static String solution(String[] strs){
        int n = strs.length;
        int lcs = Integer.MAX_VALUE;
        int temp;
        for(int i = 0; i < n; i++){
            int j = 0;
            temp = strs[i].length();
            if(temp == 0)
                return "";
            while(j < lcs && j < temp && strs[i].charAt(j) == strs[0].charAt(j)){
                j++;
            }
            lcs = j;
        }
        return strs[0].substring(0, lcs);
    }
}