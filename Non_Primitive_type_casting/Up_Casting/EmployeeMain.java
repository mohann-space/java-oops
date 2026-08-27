package Non_Primitive_type_casting.Up_Casting;
//  UpCasting
public class EmployeeMain {
    public static void main(String[] args) {
        Employee1 e = new Developer1(1001, "Tony", 26, "Java-Developer", "JFS");

        // Only Employee(parent class) properties are visible.
        System.out.println(e.id);
        System.out.println(e.name);
        System.out.println(e.age);
        System.out.println(e.designation);

        // Developer(child class) property  is Hidden.
        
    }
}
