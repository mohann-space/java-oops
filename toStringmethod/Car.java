package toStringmethod;

public class Car {
    
    String carName;
    String color;
    double price;

    public  Car(String carName, String color, double price)
    {
        this.carName = carName;
        this.color = color;
        this.price = price;
    }

    @Override 
    public String toString()
    {
        return this.carName + " " + this.color + " " + this.price + " ";
    }

    @Override 
    public  boolean equals(Object obj)
    {
        // DownCasting to car Type
        Car c = (Car)obj;
        return  this.price == c.price;
    }
}
