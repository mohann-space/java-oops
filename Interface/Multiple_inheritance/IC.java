package Interface.Multiple_inheritance;

public class IC implements Test {
    @Override
    public void s1(){
        System.out.println("s1 of Sample Interface");
    }
    @Override
    public void e1(){
        System.out.println("e1 of Example Interface");
    }
    @Override
    public void d1(){
        System.out.println("d1 of Demo Interface");
    }
    @Override
    public void t1(){
        System.out.println("t1 of Test Interface");
    }

}
