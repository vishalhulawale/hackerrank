/**
 * Expected i/p:
 * Hi 5
 * 
 * Expected o/p:
 * myString is: Hi
 * myInt is: 5 
 */

import java.util.Scanner;

class StdInStdOut {

    public static void main(String args[]) {

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Accept values
        String inputString = scanner.next();
        int inputNum1 = scanner.nextInt();

        // Print values
        System.out.println("myString is: " + inputString);
        System.out.println("myInt is: " + inputNum1);

        // Close scanner
        scanner.close();
    }

}