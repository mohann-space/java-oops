public class BankAccount {
    long accountNumber;
    String accountHolderName;
    String accountType;
    long mobileNumber;
    double balance;

    public BankAccount(long accountNumber,String accountHolderName,String accountType,long mobileNumber,double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
    }
    
    public void checkBalance()
    {
        System.out.println("Current Balance :- " + this.balance);
    }

    public void accountDetails()
    {
        System.out.println("++++++++++   A C C O U N T   D E T A I L S   +++++++++++");
        System.out.println("Account Holder Name :- " + this.accountHolderName);
        System.out.println("Account Number :- " + this.accountNumber);
        System.out.println("Account Type :- " + this.accountType);
        System.out.println("Mobile Number :- " + this.mobileNumber);
    }

    public void deposit(double amount)
    {
        if (amount>0) {
            this.balance = this.balance + amount;
            System.out.println("***************    D E P O S I T   S U C C E S S F U L L   *****************");
            System.out.println("Current Balance :- " + this.balance);
        }
        else
            System.out.println("Invalid Amount");
    }

    public void withdraw(double amount)
    {
        if (this.balance>500) {
            this.balance = this.balance - amount; 
            System.out.println("***************    W I T H D R A W  S U C C E S S F U L L   *****************");
            System.out.println("Current Balance :- " + this.balance);
        }
        else
            System.out.println("Insufficient Balance");
            System.out.println("Current Balance :- " + this.balance);
    }





}
