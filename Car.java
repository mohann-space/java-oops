public class Car {
    String brandname;
    String color;
    String model;
    double price;
    String enginetype;
    int seatingcapacity;
    String geartype;

    public Car(String brandname,String color,String model,double price,String enginetype,int seatingcapacity,String geartype)
    {
        this.brandname = brandname;
        this.color = color;
        this.model = model;
        this.price = price;
        this.enginetype = enginetype;
        this.seatingcapacity = seatingcapacity;
        this.geartype = geartype;

    }

    public void print()
    {
        System.out.println("brandname : " + brandname + " " + "color : " + color + " " + "model : " + model + " " + "price : " + price + " " + "enginetype : " + enginetype + " " + "seatingcapacity : " + seatingcapacity + " " + "geartype : " + geartype);
    }
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "Black", "M2", 1.84, "3.0L Inline-6 Turbo Petrol", 5, "8-Speed Automatic");
        c1.print();
        Car c2 = new Car("Porsche", "Carrara White Metallic", "Cayenne", 1.49, "3.0L V6 Turbo Petrol", 5, "8-Speed Tiptronic Automatic");
        c2.print();
        Car c3 = new Car("Audi", "Mythos Black", "A8 L", 1.34, "3.0L V6 Turbo Petrol", 5, "8-Speed Automatic");
        c3.print();
        Car c4 = new Car("Mercedes-Benz", "Obsidian Black", "AMG G 63", 3.64, "4.0L Twin-Turbo Petrol", 5, "9-Speed AMG SPEEDSHIFT Automatic");
        c4.print();
        Car c5 = new Car("Land Rover", "Santorini Black", "Range Rover", 2.40, "3.0L Petrol/Diesel", 5, "8-Speed Automatic");
        c5.print();
    }
}
