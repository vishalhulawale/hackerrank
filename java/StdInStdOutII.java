
/**
 * Sample Input 
 * 42 
 * 3.1415 
 * Welcome to HackerRank's Java tutorials!
 * 
 * Sample Output 
 * String: Welcome to HackerRank's Java tutorials! 
 * Double: 3.1415
 * Int: 42
 */

/**
 When switching between reading tokens of input and reading a full line of input, 
 you need to make another call to nextLine() because the Scanner object will read the 
 rest of the line where its previous read left off; if there is nothing on the line, it 
 simply consumes the newline and moves to the beginning of the next line.
 
 In the code below, the nextDouble() method stops reading at the end of the second line of 
 input, but does not move the Scanner object to the next (third) line. Because of this, 
 the subsequent call to nextLine() reads the rest of the now-empty second line, 
 consuming the newline and moving the Scanner to the beginning of the third line. 
 Once the Scanner object is at the beginning of the third line, we can call nextLine() again and 
 successfully read the line's contents.
 */
import java.util.Scanner;

class StdInStdOutII {

    public static void main(String[] args) {

        // Initialize scanner
        Scanner scan = new Scanner(System.in);

        // Accept values
        int inputInt = scan.nextInt();
        double inputDouble = scan.nextDouble();
        scan.nextLine();
        String inputString = scan.nextLine();

        // Close scanner
        scan.close();

        // Print accept values
        System.out.println("String: " + inputString);
        System.out.println("Double: " + inputInt);
        System.out.println("Int: " + inputDouble);

    }

}