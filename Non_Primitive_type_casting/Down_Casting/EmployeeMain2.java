package Non_Primitive_type_casting.Down_Casting;

public class EmployeeMain2 {
    public static void main(String[] args) {
        // UpCasting
        Employee2 e = new Developer2(1002, "Steve", 30, "Java-Dev", "JFS");

        // DownCasting
        Developer2 d = (Developer2) e;
        System.out.println(d.technology);
    }
}
