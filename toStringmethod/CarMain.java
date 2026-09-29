package toStringmethod;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("porsche", "Black");
        Car c2 = new Car("Ferrari", "Red");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
