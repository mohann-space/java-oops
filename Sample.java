public class Sample {
    static String company;
    static String brand;
    static double batteryh;
    static boolean code;

    int ipaddress;
    String color;
    int cost;
    
    static{
        company = "Apple Product ltd.";
        brand = "Apple ios";
        batteryh = 95.5;
        code = true;
    }

    {
        ipaddress=4876434;
        color="Black";
        cost=98767;
    }

    public static void main(String[] args) {
        System.out.println("Main Starts..");
        System.out.println(company);
        System.out.println(brand);
        System.out.println(batteryh);
        System.out.println(code);
        System.out.println("=======================================");
        Sample s1 = new Sample();
        System.out.println(s1.ipaddress);
        System.out.println(s1.color);
        System.out.println(s1.cost);
        System.out.println("=======================================");
        Sample s2 = new Sample();
        System.out.println(s2.ipaddress);
        System.out.println(s2.color);
        System.out.println(s2.cost);
        System.out.println("Main Ends...");
    }
}
