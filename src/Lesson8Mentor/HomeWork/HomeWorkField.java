package Lesson8Mentor.HomeWork;

public class HomeWorkField {
    public static void main(String[] args) {
        HomeWork packer = new HomeWork();
//        System.out.println(packer.canPack(9, 8, 1));  //bu true verməlidir
        System.out.println(packer.canPack(1, 0, 4));
        System.out.println(packer.canPack(0, 5, 4));
        System.out.println(packer.canPack(1, 0, 5));
        System.out.println(packer.canPack(2, 2, 11)); 
        System.out.println(packer.canPack(-3, 2, 12));
    }
}
