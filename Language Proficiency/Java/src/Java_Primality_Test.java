/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/java-primality-test/problem
 **/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java_Primality_Test {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger num = new BigInteger(n);
        if(num.isProbablePrime(1))
            System.out.println("prime");
        else
            System.out.println("not prime");
        scanner.close();
    }
}
