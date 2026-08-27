package Non_Primitive_type_casting.Down_Casting;

public class Developer2 extends Employee2 {
    String technology;

    public Developer2(int id, String name, int age, String designation, String technology)
    {
        super(id,name,age,designation);
        this.technology = technology;
    }

}
