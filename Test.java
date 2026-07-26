public class Test {
    // Parameterized Constructor
    public Test(int a,char ch,String st,double d){
        System.out.println(a);
        System.out.println(ch);
        System.out.println(st);
        System.out.println(d);
        System.out.println("=====================================");
    }
    public static void main(String[] args) {
        Test t1 = new Test(11, 'a', "Hello", 9.9);
        Test t2 = new Test(21, 'M', "hi", 99.9);
        Test t3 = new Test(9, 't', null, 89.9);
        // Object reference number.
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}
