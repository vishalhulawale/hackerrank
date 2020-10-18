// Sample Input
// 08 05 2015

// Sample Output
// WEDNESDAY

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class CalenderOps {

    public static String findDay(int year, int month, int date) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, date);
        cal.set(Calendar.YEAR, year);
        
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int month = in.nextInt();
        int date = in.nextInt();
        int year = in.nextInt();

        in.close();

        String day = findDay(year, month, date);

        System.out.println(day);

    }

}
