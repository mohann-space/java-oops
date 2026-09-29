package toStringmethod;

public class Car {
    
    String carName;
    String color;

    public  Car(String carName, String color)
    {
        this.carName = carName;
        this.color = color;
    }

    @Override 
    public String toString()
    {
        return this.carName + " " + this.color + " ";
    }
}
