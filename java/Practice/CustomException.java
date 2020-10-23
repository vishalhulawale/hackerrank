import java.util.Scanner;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }

}

public class CustomException {

    public static void main(String args[]) throws InvalidAgeException {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You are eligible for voting.");
        } else {
            throw new InvalidAgeException("Candidate is under-aged!!");
        }

    }

}
