package Lesson20.Teacher.Video;

public class GenericsBoxMain {
    public static void main(String[] args) {
//        // boxun obyektini yaradanda tip (T) istəyir
//        GenericsBox<String> box = new GenericsBox<>("Emin");
//        GenericsBox<Integer> boxInt = new GenericsBox<>(23);
//        GenericsBox<Double> boxDouble = new GenericsBox<>(4.5);
        //bir obyekt və bir class-la istədiyimiz dəyəri mənimsətdik


        Integer[] nums = {1,5,8};
        String[] names = {"Ughur","Duyghu","Ferid"};

        readArray(names);
    }

    //readArray metoduyla istədiyimiz qədər array ötürə bilirik
    public static <E> void readArray(E[] array){
    //public E tipində dəyərdi, void qaytarır
    //readArray array oxuyacaq ancaq E tipində bir array oxuyacaq
        for (E item : array){
            System.out.println(item);
        }



    }


}
