/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/java-string-tokens/problem
 **/


import java.io.*;
import java.util.*;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        String arr[] = s.split("[\\s\\!\\,\\?\\.\\_\\'\\@]+");
        // String arr[] = s.split("[^A-Z^a-z^0-9]+");
        if(s.length() == 0)
            System.out.println(0);
        else if(s.length() <= 400000)
        {
            System.out.println(arr.length);
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        }
        scan.close();
    }
}
