package main.java.com.samarth.javatutorial;

/*Carer cup Persons A and B uses an encryption based system for their conversation.
Each conversation message is encoded from the source and decoded in
the destination using a shared private positive number key known to each other.
The algorithm is illustrated with an example.
Input Format with explanation:

    Operation (1 for Encoding and 2 for Decoding)
    Input message
    Input private key

Example:

input 1 Message: Open Key: 123

Output: Oppeeen

Input: 2 Oppeeen 123

Output: Open */

import java.util.Stack;

public class encrypt_decrypt {
    public static void main(String[] args) {
        String message = "samarth";
        String key = "1234";
        String encrypt = encrypt_decrypt_solution.encrypt(message, key);
        System.out.println("Encrypted message : " + encrypt);
        String decrypt = encrypt_decrypt_solution.decrypt(encrypt, key);
        System.out.println("Decrypted message : " + decrypt);
    }
}

class encrypt_decrypt_solution {
    static String encrypt(String message, String key){
        int i = 0;
        String encrypted = "";
        while(i < message.length() && i < key.length()){
            int j = 0;
            while(j < Integer.parseInt(String.valueOf(key.charAt(i)))){
                encrypted += message.charAt(i);
                j++;
            }
            i++;
        }
        while(i < message.length()){
            encrypted += message.charAt(i);
            i++;
        }
        return encrypted;
    }

    static String decrypt(String message, String key){
//        Stack<array_burst_problem_solution.Pair> stk = new Stack<array_burst_problem_solution.Pair>();
        int i = 0;
        int j = 0;
        String decrypt = "";
        while(i < message.length() && i < key.length()){
            decrypt += message.charAt(j);
            j += Integer.parseInt(String.valueOf(key.charAt(i)));
            i++;
        }
        while (j < message.length()){
            decrypt += message.charAt(j);
            j++;
        }
        return decrypt;
    }
}