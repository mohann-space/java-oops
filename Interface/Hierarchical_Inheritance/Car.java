package Interface.Hierarchical_Inheritance;

public class Car implements Vehicle {
    public void start()
    {
        System.out.println("Car starts");
    }

    void drive()
    {
        System.out.println("Car is driving");
    }
}
