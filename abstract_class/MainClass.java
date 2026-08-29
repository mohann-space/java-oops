package abstract_class;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the Device");
            System.out.println("1. Mobile");
            System.out.println("2. Laptop");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            if (choice==1) {
                Mobile m1 = new Mobile();
                System.out.println("Select the Function");
                System.out.println("a. Power ON");
                System.out.println("b. Power OFF");
                System.out.println("c. Restart");
                char opt = sc.next().charAt(0);
                switch (opt) {
                    case 'a': m1.powerOn(); break;
                    case 'b': m1.powerOff(); break;
                    case 'c': m1.restart(); break;
                
                    default: System.out.println("Invalid Function..."); break;
                }
            }
            else if (choice==2) {
                Laptop l1 = new Laptop();
                System.out.println("Select the Function");
                System.out.println("a. Power ON");
                System.out.println("b. Power OFF");
                System.out.println("c. Restart");
                char opt = sc.next().charAt(0);
                switch (opt) {
                    case 'a': l1.powerOn(); break;
                    case 'b': l1.powerOff(); break;
                    case 'c': l1.restart(); break;
                
                    default: System.out.println("Invalid Function..."); break;
                }
            }
            else if (choice==3) {
                System.out.println("**********  Thank You  *********");
                System.exit(0);
            }
            else
                System.out.println("Invalid Choice...");
        }
    }
}
