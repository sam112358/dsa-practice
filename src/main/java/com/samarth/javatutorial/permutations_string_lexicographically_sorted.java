package main.java.com.samarth.javatutorial;

public class permutations_string_lexicographically_sorted {
    public static void main(String[] args) {
        String str = "SGBA";
        int n = str.length();
        solution(str, 0, n-1);
    }

    static void solution(String str, int l, int r){
        if(l == r)
            System.out.println(str);
        else{
            for(int i = l; i <= r; i++){
                str = swap(str, l, i);
                solution(str, l+1, r);
                str = swap(str, l, i);
            }
        }
    }

    static String swap(String str, int l, int r){
        char[] charArray = str.toCharArray();
        char temp;
        temp = charArray[l];
        charArray[l] = charArray[r];
        charArray[r] = temp;
        return String.valueOf(charArray);
    }
}
