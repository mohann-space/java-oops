package Constructor_Chaining;
// Parent class
public class Sample1 {
    public Sample1(){
        System.out.println("Non - para Constructor of Sample1 class");
    }

    public Sample1(int a){
        this();
        System.out.println("int - para Constructor of Sample1 class");
    }

    public Sample1(String st,int a){
        this(a);
        System.out.println("String and int - para Constructor of Sample1 class");
    }
}
