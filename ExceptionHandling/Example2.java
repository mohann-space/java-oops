package ExceptionHandling;
// Limited chances
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main Starts...");
        System.out.println("Enter the Numerator");
        int a = sc.nextInt();
        System.out.println("Enter the Denominator");
        int b = sc.nextInt();
        int chance = 5;
        while (true) {
            try
            {
                // Dangerous Statement
                System.out.println(a/b);
                break;
            }
            catch(ArithmeticException e)
            {
                // Limited chances
                chance--;
                if (chance==0) {
                    System.out.println("User Blocked!");
                    break;
                }
                System.out.println("Re-enter the Denominator Value");
                b = sc.nextInt();
            }
        }
    }
}
