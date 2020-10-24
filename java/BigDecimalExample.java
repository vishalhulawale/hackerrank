import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        sc.close();

        for (int i = 0; i < arr.length; i++) {

            BigDecimal first = new BigDecimal(arr[i]);

            int index = i;

            for (int j = i + 1; j < arr.length; j++) {

                BigDecimal second = new BigDecimal(arr[j]);

                if (second.compareTo(first) == 1) {
                    first = second;
                    index = j;
                }

            }

            String temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
