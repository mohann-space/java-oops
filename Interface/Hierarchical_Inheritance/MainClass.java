package Interface.Hierarchical_Inheritance;

public class MainClass {
    public static void main(String[] args) {
        
        Car c = new Car();
        c.start();
        c.drive();

        Bike b = new Bike();
        b.start();
        b.ride();
    }
}
