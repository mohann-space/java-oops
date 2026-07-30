// Base - Class

public class Mobile {
    String brandName;
    String color;
    String model;
    double price;
    int ram;
    int storageCapacity;
    int batterCapacity;
    String os;

    public Mobile(String brandName,String color,String model,double price, int ram, int storageCapacity,int batterCapacity,String os )
    {
        this.brandName = brandName;
        this.color = color;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.batterCapacity = batterCapacity;
        this.os = os;
    }

    public void print()
    {
        System.out.println("------------------   Mobile Details  -----------------");
        System.out.println("Brand Name :- " + this.brandName + "\nColor :- " + this.color + "\nModel :- " + this.model + "\nPrice :- " + this.price + "$" + "\nRAM :- " + this.ram + "GB "+"\nStorage Capacity :- " + this.storageCapacity + "GB " + "\nBattery Capacity :- " + this.batterCapacity + "Mah " + "\nOS :- " + this.os);
    }

    
}
