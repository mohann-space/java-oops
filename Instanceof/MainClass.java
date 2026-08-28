package Instanceof;

public class MainClass {
    public static void main(String[] args) {
        
        B b1 = new B();
        System.out.println(b1 instanceof C);
        System.out.println(b1 instanceof A);
        System.out.println(b1 instanceof B);

        System.out.println("--------------------------");

        C c1 = new C();
        System.out.println(c1 instanceof A);
        System.out.println(c1 instanceof B);
        System.out.println(c1 instanceof C);
    }
}
