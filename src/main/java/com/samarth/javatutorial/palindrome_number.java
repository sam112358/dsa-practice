package main.java.com.samarth.javatutorial;

/*
Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.



Constraints:

    -231 <= x <= 231 - 1

 */
public class palindrome_number {
    public static void main(String[] args) {
        int x = 121;
        Boolean output2 = solution2(x);
        System.out.println(output2);
    }

    public static Boolean solution1(int x){
        // iterate from both ends and keep comparing
        int len = String.valueOf(x).length() - 1;
        if (len == 0)
            return true;
        if (x < 0)
            return false;
        int i = 0, j = 0;
        while (x > 0) {
            i = (int)(x / Math.pow(10, len));
            x %= Math.pow(10, len);
            j = (int)(x % 10);
            x /= 10;
            len -= 2;
            if (i != j)
                return false;
            if (len == 0)
                return true;
        }
        return true;
    }

    public static Boolean solution2(int x){
        // save each half of the number and compare at end
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}