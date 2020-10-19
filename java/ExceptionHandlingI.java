// Sample Input 0:
// 10
// 3

// Sample Output 0:
// 3

// Sample Input 1:
// 10
// Hello

// Sample Output 1:
// java.util.InputMismatchException

// Sample Input 2:
// 10
// 0

// Sample Output 2:
// java.lang.ArithmeticException: / by zero

// Sample Input 3:
// 23.323
// 0

// Sample Output 3:
// java.util.InputMismatchException

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingI {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            System.out.println(num1 / num2);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
