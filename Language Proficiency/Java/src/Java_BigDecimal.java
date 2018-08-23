/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/java-bigdecimal/problem
 **/


import java.math.BigDecimal;
import java.util.*;
class Java_BigDecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();


        //Write your code here

        Arrays.sort(s,0,n, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal x = new BigDecimal(s1);
                BigDecimal y = new BigDecimal(s2);
                return x.compareTo(y);
            }
        }));


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
