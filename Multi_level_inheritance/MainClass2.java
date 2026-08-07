package Multi_level_inheritance;

public class MainClass2 {
    public static void main(String[] args) {
        Orchids orc = new Orchids();
        orc.grow(); // Plant Behaviours
        orc.bloom(); // Flower Behaviours
        orc.adapt(); // Orchid Behaviours
    }
}
