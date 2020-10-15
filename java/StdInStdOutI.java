/**
 * Sample i/p:
 * 42
 * 100
 * 125
 * 
 * Sample o/p:
 * 42
 * 100
 * 125
**/
import java.util.Scanner;

class StdInStdOutI {

    public static void main(String[] args) {

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Accept values
        int inputNum1 = scanner.nextInt();
        int inputNum2 = scanner.nextInt();
        int inputNum3 = scanner.nextInt();

        // Close scanner
        scanner.close();
        
        // Print values
        System.out.println(inputNum1);
        System.out.println(inputNum2);
        System.out.println(inputNum3);

    }

}