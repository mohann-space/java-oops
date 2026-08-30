package Abstraction.Level2_abstraction;

public class Utility {
    public Example getExample()
    {
        return new Exp();
    }

    private class Exp implements Example {
    
        @Override
        public void test()
        {
            System.out.println("Test method of Example Interface");
        }
    }
}
