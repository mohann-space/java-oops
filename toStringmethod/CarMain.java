package toStringmethod;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("Porsche", "Black", 2317859.99);
        Car c2 = new Car("Ferrari", "Red", 1247538.99);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));
    }
}
