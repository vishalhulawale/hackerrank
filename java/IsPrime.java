// Sample Input
// 13

// Sample Output
// prime

import java.util.Scanner;
import java.math.BigInteger;

public class IsPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger num = new BigInteger(sc.next());

        sc.close();

        if (num.isProbablePrime(100)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

}
