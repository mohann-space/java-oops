package abstract_class;

public class Laptop extends ElectronicDevice {
    @Override
    public void powerOn()
    {
        System.out.println("Laptop Power ON");
    }
    @Override
    public void powerOff()
    {
        System.out.println("Laptop Power OFF");
    }
    @Override
    public void restart()
    {
        System.out.println("Laptop Restart...");
    }
}
