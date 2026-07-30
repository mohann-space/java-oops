import java.util.Scanner;
public class BankaccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("...Enter your Account Details...");
        System.out.println("Enter your Account Number : ");
        long an = sc.nextLong();
        System.out.println("Enter Account Holder Name : ");
        String ahn = sc.next();
        System.out.println("Enter Account Type : ");
        String acctype = sc.next();
        System.out.println("Enter Account Mobile Number : ");
        long phn = sc.nextLong();
        System.out.println("Enter the Min. Bank Balance");
        double bal = sc.nextDouble();

        BankAccount ba1 = new BankAccount(0, null, null, 0, 0);
    
        while(true)
        {
            System.out.println("**************    M E N U    *************");
            
            System.out.println("1. Deposit ");
            System.out.println("2. withDraw ");
            System.out.println("3. Check Balance ");
            System.out.println("4. Account Details ");
            System.out.println("5. Exit ");
            System.out.println("Enter a option");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:{
                        System.out.println("Enter the amount to Deposit");
                        double amount = sc.nextDouble();
                        ba1.deposit(amount);
                }
                break;
                case 2:{
                        System.out.println("Enter the amount to withdraw");
                        double amount = sc.nextDouble();
                        ba1.withdraw(amount);
                }
                break;
                case 3:{
                        ba1.checkBalance();
                }
                break;
                case 4:{
                        ba1.accountDetails();
                }
                break;
                case 5:{
                        System.out.println("Exit Successfully..");
                        System.exit(0);
                }
                break;    
            
                default:{
                    System.out.println("Invalid option");
                }
                break;
            }
    
        }
    }
    
    }

