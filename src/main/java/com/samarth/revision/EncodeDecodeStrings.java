package main.java.com.samarth.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EncodeDecodeStrings {
    public static void main(String args[]) {
        ArrayList<String> strs = new ArrayList<>(Arrays.asList("neet","code","love","you"));
        String encoded = encode(strs);
        System.out.println(encoded);
        System.out.println(decode(encoded));
    }

    public static String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strs) {
            stringBuilder.append(s.length()).append("%").append(s);
        }
        return stringBuilder.toString();
    }

    public static List<String> decode(String str) {
        int i = 0;
        ArrayList<String> res = new ArrayList<>();
        while ( i < str.length() ) {
            int skip = ReadTillDelim(str, i);
            if(skip > 9)
                i += 3;
            else
                i+=2;
            String currWord = str.substring(i, i+skip);
            res.add(currWord);
            i += skip;
        }
        return res;
    }

    public static int ReadTillDelim(String str, int start) {
        char[] charArr = str.substring(start).toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (true) {
            stringBuilder.append(charArr[i]);
            i++;
            if (charArr[i] == '%')
                break;
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
