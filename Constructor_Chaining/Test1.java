package Constructor_Chaining;
// Child class
public class Test1 extends Sample1 {
    public Test1(){
        this('A');
        System.out.println("Non - para Constructor of Test1 class");
    }

    public Test1(char ch){
        this("Haaooi", 1);
        System.out.println("Char - para Constructor of Test1 class");
    }

    public Test1(String st, int a){
        super(st, a); // Chaining Child constructor with parent constructor
        System.out.println("String and int - para Constructor of Test1 class");
    }
}
