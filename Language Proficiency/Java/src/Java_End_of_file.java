/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/java-end-of-file/problem
 **/



import java.io.*;
import java.util.*;

public class Java_End_of_file {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String scan;
        int count = 1;
        while(sc.hasNextLine())
        {
            scan = sc.nextLine();
            System.out.println(count + " " + scan);
            count++;
        }
    }
}
