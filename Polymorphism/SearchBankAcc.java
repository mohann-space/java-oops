package Polymorphism;
// Compile-time polymorphism
// Syntatical Example...
public class SearchBankAcc {

    public static void search(String name, long accountNumber)
    {
        System.out.println("Account search using Name and Account Number");
    }

    public static void search(long aadhaarNumber, String panNumber)
    {
        System.out.println("Account search using Aadhaar Number and Pan Number");
    }

    public static void search(long mobileNumber, long aadhaarNumber)
    {
        System.out.println("Account search using Mobile Number and Aadhaar Number");
    }
}
