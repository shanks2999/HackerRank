/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/java-currency-formatter/problem
 **/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Currency_Formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nf = null;
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf.format(payment);
        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}