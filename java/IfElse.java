
/**
 Task
 Given an integer n perform the following conditional actions:
 If n is odd, print Weird
 If n is even and in the inclusive range of 2 to 5, print Not Weird
 If n is even and in the inclusive range of 6 to 20, print Weird
 If n is even and greater than 20, print Not Weird

 Input Format
 A single line containing a positive integer.
 
 Output Format
 Print Weird if the number is weird; otherwise, print Not Weird.
 
 Sample Input 0
 3

 Sample Output 0
 Weird

 Sample Input 1
 24

 Sample Output 1
 Not Weird
*/

import java.util.Scanner;

class IfElse {

    public static void main(String[] args) {

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Accept values
        int inputNum = scanner.nextInt();

        // Close scanner
        scanner.close();

        // Check if number is even
        if (inputNum % 2 == 0 && (inputNum >= 2 && inputNum <= 5 || inputNum > 20)) {

            System.out.println("Not Weird");

        } else {

            System.out.println("Weird");

        }

    }

}
