//  Main - Class

import java.util.Scanner;
public class MobileMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Brand Name");
        String bn = sc.next();
        System.out.println("Enter the Color");
        String color = sc.next();
        System.out.println("Enter the Model ");
        String model = sc.next();
        System.out.println("Enter the price");
        double price = sc.nextDouble();
        System.out.println("Enter the RAM");
        int ram = sc.nextInt();
        System.out.println("Enter the Storage Capacity");
        int stc = sc.nextInt();
        System.out.println("Enter the Batter Capacity");
        int bc = sc.nextInt();
        System.out.println("Enter the OS");
        String os = sc.next();

        Mobile m1 = new Mobile(bn, color, model, price, ram, stc, bc, os);
        m1.print();
    }
}
