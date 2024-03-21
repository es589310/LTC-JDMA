package Lesson9Mentor.Kababchi;

import java.util.Arrays;

public class Menu {
    Kabab[] kababs;
    Meze[] mezes;
    İchki[] i̇chkis;

    public Menu(Kabab[] kababs, Meze[] mezes, İchki[] i̇chkis) {
        this.kababs = kababs;
        this.mezes = mezes;
        this.i̇chkis = i̇chkis;
    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for(Kabab kabab : kababs){
            totalPrice += kabab.getPrice();
        }
        for (Meze meze : mezes){
            totalPrice += meze.getPrice();
        }
        for (İchki i̇chki : i̇chkis){
            totalPrice += i̇chki.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "kababs=" + Arrays.toString(kababs) +
                ", mezes=" + Arrays.toString(mezes) +
                ", i̇chkis=" + Arrays.toString(i̇chkis) +
                '}';
    }
}
