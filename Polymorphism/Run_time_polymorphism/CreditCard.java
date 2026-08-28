package Polymorphism.Run_time_polymorphism;

public class CreditCard extends Payment {
    @Override
    void pay()
    {
        System.out.println("Payment through Credit Card");
    }
}
