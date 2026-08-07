package Constructor_Chaining;

public class Test {

    public Test(){
        this(1, 'A', "haaoi", 11.11);
        System.out.println("Non - Parameterized Constructor");
        System.out.println();
    }

    public Test(int a){
        this(24,"hola");
        System.out.println("int - parameterized Constructor");
        System.out.println();
    }

    public Test(int b,String st){
        this();
        System.out.println("int & String - parameterized Constructor");
        System.out.println();
    }

    public Test(int c,char ch,String sr,double d){
        System.out.println("int, Char, String, double  - parameterized Constructor");
        System.out.println();
    }
    
    public Test(String str){
        this(11);
        System.out.println("String - parameterized Constructor");
        System.out.println();
    }

    public static void main(String[] args) {
        Test t1 = new Test("java");
    }
}
