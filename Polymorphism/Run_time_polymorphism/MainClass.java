package Polymorphism.Run_time_polymorphism;

public class MainClass {
    public static void main(String[] args) {
        
        Payment p;

        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();

        p = new NetBanking();
        p.pay();
    }
}
