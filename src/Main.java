import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("This program computes the GCD of two positive integers.");
            Scanner scan = new Scanner(System.in);

            int firstint = 0;
            int secondint = 0;
            int gcd;

            while (firstint == 0) {
                System.out.println("Enter the first integer: ");
                firstint = scan.nextInt();
                if (firstint <= 0) {
                    System.out.println("This is not a valid integer!");
                } else if (firstint > 0) {
                    while ( secondint ==0) {
                        System.out.println("Enter the second integer: ");
                        secondint = scan.nextInt();
                    }
                }
                if (secondint <= 0) {
                    System.out.println("Please try again.");
                } else if (secondint > 0) {
                    while (secondint != 0) {
                        gcd = firstint % secondint;
                        firstint = secondint;
                        secondint = gcd;
                    }

                    System.out.println("                             ");
                    System.out.println("The GCD is: " + firstint + "!");
                }
            }
        }
    }
}