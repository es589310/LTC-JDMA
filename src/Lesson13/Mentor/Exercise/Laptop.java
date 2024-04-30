package Lesson13.Mentor.Exercise;

public class Laptop extends Product{
    CPU cpu;
    GPU gpu;

    public Laptop(String brand, String model, CPU cpu, GPU gpu) {
        super(brand, model);
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public void start(){
        System.out.println(brand + " " + model + " kompüterin " + " prosessoru" + cpu + ", videokartı " + gpu + " GB-dır.");

    }

//    public Laptop(String brand, String model) {
//        super(brand, model);
//    }

    //    @Override
//    public String toString() {
//        return "Product{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", CPU='" + cpu.getCores() + '\'' +
//                ", GPU='" + gpu.getvRam() + '\'' +
//
//                '}';
//    }
}
