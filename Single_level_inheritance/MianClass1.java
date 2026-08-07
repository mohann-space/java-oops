package Single_level_inheritance;

public class MianClass1 {
    public static void main(String[] args) {
        Plant p1 = new Plant();
        p1.grow();

        System.out.println("------------------");

        Flower f1 = new Flower();
        f1.grow();
        f1.bloom();

    }
}
//  Flower "Is-a-Relationship" of Plant.