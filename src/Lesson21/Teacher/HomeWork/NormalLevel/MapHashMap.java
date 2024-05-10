package Lesson21.Teacher.HomeWork.NormalLevel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapHashMap {
    public static void main(String[] args) {
        Map<String, Boolean> names = new HashMap<>();
        names.put(null,true);
        names.put("Emine",null);
        names.put("Ferhan",false);
        names.put("Tunar",true);
        names.put("Emin",true);
        names.put("Elif",true);
        names.put("Enes",false);

        for (Map.Entry item : names.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }//hash kodlarina gore chap edilir ve null her bir halda verilir
}
