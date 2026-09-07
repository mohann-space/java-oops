package ExceptionHandling;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main Starts...");
        System.out.println("Enter the Numerator");
        int a = sc.nextInt();
        System.out.println("Enter the Denominator");
        int b = sc.nextInt();
        while (true) {
            try
            {
                System.out.println(a/b);
                break;
            }
            catch(ArithmeticException e)
            {
                System.out.println("Re-enter the Denominator Value");
                b = sc.nextInt();
            }
        }
    }
}
