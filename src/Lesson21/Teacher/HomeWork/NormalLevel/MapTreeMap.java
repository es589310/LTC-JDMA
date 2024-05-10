package Lesson21.Teacher.HomeWork.NormalLevel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTreeMap {
    public static void main(String[] args) {
        Map<String, Boolean> names = new TreeMap<>();
        names.put("Samirem",true);
        names.put("Emine",false);
        names.put("Ferhan",false);
        names.put("Tunar",true);
        names.put("Emin",true);
        names.put("Elif",true);
        names.put("Enes",false);

        for (Map.Entry item : names.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }//sort olunmush veziyyetde bir nov elifba sirasi ile chixir
    }
}
