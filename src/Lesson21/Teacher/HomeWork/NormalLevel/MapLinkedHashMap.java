package Lesson21.Teacher.HomeWork.NormalLevel;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinkedHashMap {
    public static void main(String[] args) {
        //LinkedHashMap
        Map<String, Boolean> names = new LinkedHashMap<>();
        names.put("Samirem",true);
        names.put("Emine",false);
        names.put("Ferhan",false);
        names.put("Tunar",true);
        names.put("Emin",true);
        names.put("Elif",true);
        names.put("Enes",false);


    for (Map.Entry item : names.entrySet()){
        System.out.println(item.getKey() + " " + item.getValue());
    }
    //her shey oldugu kimi verilir

    }






    }

