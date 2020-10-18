// Sample Input
// 12324.134

// Sample Output
// US: $12,324.13
// India: Rs.12,324.13
// China: ￥12,324.13
// France: 12 324,13 €

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormats {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double payment = in.nextDouble();

        in.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

}
