public class Sample1 {
    public double d;

    public void m1(){
        System.out.println("m1 is the Non-static method of Sample1 class");
    }
    public static void main(String[] args) {
        Sample1 s = new Sample1();
        System.out.println(d);
        m1();
    }
}
