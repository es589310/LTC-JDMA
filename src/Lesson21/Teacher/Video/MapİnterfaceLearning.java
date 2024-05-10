package Lesson21.Teacher.Video;

import java.util.*;

public class MapİnterfaceLearning {
    public static void main(String[] args) {
        //Map interface-dir, key=value ilə işləyir, bir neçə implementasiyaları var
        Map<String,String> maps = new LinkedHashMap<>(); //linkedhashmapda ise siralam oldughu kimi chixir
//        Map<String,String> maps = new TreeMap<>(); //artan sira ile duzur
//        Map<String,String> maps = new HashMap<>(); //null ola biler
//        Map<String,String> maps = new Hashtable<>(); //null hec qebul etmir = exception
        //hashtable synchronized -dir yeni thread safe movcuddur
        maps.put("1","null");
        maps.put("4","Abi");
        maps.put("3","Togrul");
        maps.put("2","Enes");
        //hash deyerlerine gore siralandigi uchun hemise reqemler ardicilliqi eyni gelir

//        System.out.println(maps.get(3));
        //forla chap etmek
//        for (Map.Entry<Integer, String> item : maps.entrySet()){ // buda doğru yazılışdı
        for (Map.Entry item : maps.entrySet()){
            System.out.println(item.getKey() +  " = " +item.getValue());
        }


    }
}
