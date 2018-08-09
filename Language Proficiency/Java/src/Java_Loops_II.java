/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/java-loops/problem
 **/



import java.util.*;
import java.io.*;

class Java_Loops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int prev = a;
            for(int j=0;j<n;j++)
            {
                int next = prev + ((int)Math.pow(2,j) * b);
                System.out.print(next + " ");
                prev = next;
            }
            System.out.println();
        }
        in.close();
    }
}
