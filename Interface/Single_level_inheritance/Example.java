package Interface.Single_level_inheritance;

public class Example implements Sample {
    @Override
    public void t1(int a)
    {
        System.out.println("t1 of test interface");
        System.out.println(a);
    }
    @Override
    public int s1()
    {
        System.out.println("s1 of sample interface");
        return 0;
    }
}
