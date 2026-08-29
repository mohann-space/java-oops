package abstract_class;

public class Mobile extends ElectronicDevice {
    @Override
    public void powerOn()
    {
        System.out.println("Mobile Power ON");
    }
    @Override
    public void powerOff()
    {
        System.out.println("Mobile Power OFF");
    }
    @Override
    public void restart()
    {
        System.out.println("Mobile Restart...");
    }
}
