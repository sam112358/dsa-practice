package main.java.com.samarth.javatutorial;

public class palindrome_number {
    public static void main(String[] args) {
        int num = 121121;
        Boolean output2 = solution(num);
        System.out.println(output2);
    }

    public static Boolean solution(int num){
        int len = String.valueOf(num).length() - 1;
        int i = 0, j = 0;
        while(num > 0){
            if(len == 0){
                return true;
            }
            i = (int)(num / Math.pow(10, len));
            num = (int)(num % Math.pow(10, len));
            j = num % 10;
            num = num / 10;
            len -= 2;
            if(i != j)
                return false;
        }
        return true;
    }
}