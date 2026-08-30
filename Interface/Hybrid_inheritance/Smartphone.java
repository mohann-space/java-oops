package Interface.Hybrid_inheritance;

public class Smartphone implements Camera,MusicPlayer{

    public void powerOn(){
        System.out.println("Smartphone is powered ON");
    }

    public void takePhoto(){
        System.out.println("Taking a photo");
    }

    public void playMusic(){
        System.out.println("Playing music");
    }
    
}
