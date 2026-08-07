package Hierarchical_Inheritance;

public class MainClass3 {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.work();
        dev.code();

        System.out.println();

        Tester tester = new Tester();
        tester.work();
        tester.test();

        System.out.println();

        Manager mgr = new Manager();
        mgr.work();
        mgr.manage();

        System.out.println();

        Designer des = new Designer();
        des.work();
        des.design();
    }
}
