package main.java.com.samarth.javatutorial;

public class check_string_rotated_2_places {
    public static void main(String[] args) {
        String a = "geeksforgeeks", b = "geeksgeeksfor";
        if((a.substring(2) + a.substring(0,2)).equals(b) || (a.substring(a.length()-2, a.length()) + a.substring(0, a.length()-2)).equals(b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
