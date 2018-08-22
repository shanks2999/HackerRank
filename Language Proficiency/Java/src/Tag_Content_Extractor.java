/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/tag-content-extractor/problem
 **/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tag_Content_Extractor{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            String regex = "<(.+)>+([^<]+)(</\\1>)";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);
            boolean found_one = false;
            while (m.find()) {
                found_one = true;
                System.out.println(m.group(2));
            }
            if(!found_one)
                System.out.println("None");
            // if(Pattern.matches(regex, line))
            //     System.out.println("Right");
            // else
            //     System.out.println("Wrong");

            testCases--;
        }
    }
}
