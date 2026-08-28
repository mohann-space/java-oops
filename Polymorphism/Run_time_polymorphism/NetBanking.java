package Polymorphism.Run_time_polymorphism;

public class NetBanking extends Payment {
    @Override
    void pay()
    {
        System.out.println("Payment through Net Banking");
    }
}
