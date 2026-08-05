package inheritanceExample;

public class MainClass {
    public static void main(String[] args) {
        
        //  Parent class object
        Vehicle v1 = new Vehicle();
        v1.start();

        System.out.println("--------------------------");

        //  Child class object
        Car c1 = new Car();
        c1.start();
        c1.closeDoor();
    }
}
