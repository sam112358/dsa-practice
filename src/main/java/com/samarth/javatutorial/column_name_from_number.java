package main.java.com.samarth.javatutorial;

import java.util.Collections;

public class column_name_from_number {
    public static void main(String[] args) {
        long col = 96;
        System.out.println(colName(col));
    }

    static String colName(long n){
        StringBuilder col = new StringBuilder();
        if(n < 27) {
            String app = String.valueOf((char) (n + 64));
            col.append(app);
        }
        else{
            long mul = n / 26;
            long rem = n % 26;

            for(int i = 1; i <= mul; i++){
                col.append("A");
            }
            String app = String.valueOf((char)(rem + 64));
            col.append(app);
        }
        return col.toString();
    }
}
