package Interface;

public class Example implements Test {
    @Override
    public void t1(int a)
    {
        System.out.println("t1 in Example Class..");
        System.out.println(a);
    }
}
