package Lesson20.Teacher.HomeWork;

import java.util.HashSet;
import java.util.Set;

public class Numbers {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(23);
        nums.add(52);
        nums.add(52);
        nums.add(777);
        nums.add(887);
        nums.add(769);
        nums.add(172);
        nums.add(073); //Octal İnteger olduğu üçün
        nums.add(121);
        nums.add(121);
        nums.add(708);
        nums.add(208);

        for (int count : nums){ //primitiv int-lə çağırmaq doğrudurmu?
            System.out.println(count);
        }
    }
}
