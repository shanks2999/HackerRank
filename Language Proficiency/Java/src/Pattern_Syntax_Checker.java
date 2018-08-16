/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 **/



import java.util.Scanner;
import java.util.regex.*;

public class Pattern_Syntax_Checker
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            testCases--;
            try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException ex){
                System.out.println("Invalid");
            }
        }
    }
}
