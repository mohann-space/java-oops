public class Employee {
    int id;
    String name;
    int age;
    String email;
    String designation;
    int salary;
    static String companyname;

    static{
        companyname = "Google";
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 9184;
        e1.name = "Sai";
        e1.age = 25;
        e1.email = "Sai97654@mail";
        e1.designation = "Manual testing";
        e1.salary = 75000;

        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.email);
        System.out.println(e1.designation);
        System.out.println(e1.salary);
        System.out.println(companyname);

        Employee e2 = new Employee();
        e2.id = 9194;
        e2.name = "Sujith";
        e2.age = 26;
        e2.email = "sujith876@mail";
        e2.designation = "Developer";
        e2.salary = 95000;

        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e2.age);
        System.out.println(e2.email);
        System.out.println(e2.designation);
        System.out.println(e2.salary);
        System.out.println(companyname);


        Employee e3 = new Employee();
        e3.id = 9204;
        e3.name = "Raghu";
        e3.age = 24;
        e3.email = "Raghu9827h@mail";
        e3.designation = "Software Associative";
        e3.salary = 55000;

        System.out.println(e3.id);
        System.out.println(e3.name);
        System.out.println(e3.age);
        System.out.println(e3.email);
        System.out.println(e3.designation);
        System.out.println(e3.salary);
        System.out.println(companyname);
    }
}
