/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/java-anagrams/problem
 **/


import java.util.Scanner;

public class Java_Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int ascii[] = new int[128];
        boolean is_anagram = true;
        for(int i=0;i<a.length();i++)
            ascii[(int)Character.toLowerCase(a.charAt(i))]++;
        for(int i=0;i<b.length();i++)
        {
            ascii[(int)Character.toLowerCase(b.charAt(i))]--;
            if(ascii[(int)Character.toLowerCase(b.charAt(i))] < 0)
            {
                is_anagram = false;
                break;
            }
        }
        if(is_anagram)
        {
            for(int i=0;i<ascii.length;i++)
            {
                if(ascii[i] != 0 )
                {
                    is_anagram = false;
                    break;
                }
            }
        }

        return is_anagram;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
