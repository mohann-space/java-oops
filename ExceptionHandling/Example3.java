package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main Starts...");
        System.out.println("Enter an Integer value");
        int a;
        while (true) {
            try
            {
                a = sc.nextInt();
                break;
            }
            //  Input Mismatch Exception..
            catch(InputMismatchException i)
            {
                sc.next();
                System.out.println("Re-enter the Input..");
            }
        }

        System.out.println(a);
        System.out.println("Main Ends....");
    }
}
