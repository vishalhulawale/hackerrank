import java.util.Scanner;

public class StaticBlock {
    static Scanner in = new Scanner(System.in);
    static int B, H;
    static boolean flag;

    static {
        B = in.nextInt();
        H = in.nextInt();

        in.close();

        flag = B > 0 && H > 0;

        if (!flag) {
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }

    }// end of main

}// end of class
