/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/java-regex/problem
 **/


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Java_Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex
{
    public String pattern;
    MyRegex()
    {
        pattern = "(([0-9]|[0-9][0-9]|[01][0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}" +
                "([0-9]|[0-9][0-9]|[01][0-9][0-9]|2[0-4][0-9]|25[0-5])" ;

        // pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
        //           "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

    }
}
