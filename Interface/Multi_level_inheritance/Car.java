package Interface.Multi_level_inheritance;

import inheritanceExample.Vehicle;

public class Car extends Vehicle {

    public void start()
    {
        System.out.println("Car starts");
    }
    void drive()
    {
        System.out.println("Car is driving");
    }
}
