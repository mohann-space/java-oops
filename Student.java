//  ------------------ this. Keyword ------------
public class Student {

    int id;
    String name;
    char gender;
    int age;
    double cgpa;

    public void print()
    {
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("age : " + age);
        System.out.println("cgpa : " + cgpa);
        System.out.println("----------------------------------");
    }
    
    public Student(int id,String name,char gender,int age,double cgpa)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.cgpa = cgpa;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1001, "raju", 'M', 24, 8.5);
        s1.print();
        Student s2 = new Student(1002, "rani", 'F', 23, 9.5);
        s2.print();
        Student s3 = new Student(1003, "radhika", 'F', 22, 7.5);
        s3.print();
        Student s4 = new Student(1004, "ramu", 'M', 23, 7.7);
        s4.print();

    }
}
