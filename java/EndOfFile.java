// Sample Input
// Hello world
// I am a file
// Read me until end-of-file.

// Sample Output
// 1 Hello world
// 2 I am a file
// 3 Read me until end-of-file.

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 1; in.hasNext() == true; i++) {
            System.out.println(i + " " + in.nextLine());
        }

        in.close();

    }

}
