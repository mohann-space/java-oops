package Non_Primitive_type_casting.Up_Casting;

public class Developer1 extends Employee1 {
    String technology;

    public Developer1(int id, String name, int age, String designation, String technology)
    {
        super(id,name,age,designation);
        this.technology = technology;
    }
}
