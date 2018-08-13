/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/java-date-and-time/problem
 **/

import java.util.Scanner;
import java.util.Date;
class Java_Date_and_Time
{
    static String getDay(String day, String month, String year)
    {
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        // java.util.Calendar cal = java.util.Calendar.getInstance();
        // cal.set(y, m-1, d);
        java.util.Calendar cal = new java.util.GregorianCalendar(y, m-1, d);
        String dow = "";
        switch(cal.get(java.util.Calendar.DAY_OF_WEEK))
        {
            case 1:
                dow = "SUNDAY";
                break;
            case 2:
                dow = "MONDAY";
                break;
            case 3:
                dow = "TUESDAY";
                break;
            case 4:
                dow = "WEDNESDAY";
                break;
            case 5:
                dow = "THURSDAY";
                break;
            case 6:
                dow = "FRIDAY";
                break;
            case 7:
                dow = "SATURDAY";
                break;
        }
        return dow;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}