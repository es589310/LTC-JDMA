package Lesson13Mentor.Exercise;

public class GPU extends Product{
    private int vRam;

    public int getvRam() {
        return vRam;
    }

    public GPU(String brand, String model, int vRam) {
        super(brand, model);
        this.vRam = vRam;
    }
    public void render(){
        System.out.println("Video kart gücü: " + getvRam() + " GB");
    }
}
