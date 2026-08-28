package Polymorphism.Run_time_polymorphism;

public class UPI extends Payment {
    @Override
    void pay()
    {
        System.out.println("Payment through UPI");
    }
}
