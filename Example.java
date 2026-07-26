public class Example {
    // Parameterized Constructor
    public Example(int a,int b,double c,double d){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("--------------------------------------------");
    }
    public static void main(String[] args) {
        Example e1 = new Example(11, 12, 1.3, 1.4);
        Example e2 = new Example(21, 22, 2.3, 2.4);
        Example e3 = new Example(31, 32, 3.3, 3.4);
        // Object Refrence Number
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
