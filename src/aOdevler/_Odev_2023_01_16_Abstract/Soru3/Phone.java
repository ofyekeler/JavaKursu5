package aOdevler._Odev_2023_01_16_Abstract.Soru3;

import java.util.ArrayList;

public abstract class Phone {
    public static ArrayList<String> card=new ArrayList<>();
    public static int getSum(ArrayList<String> liste){
        int total=0;
        for (String str : liste) {
            int odeme;
            odeme=Integer.parseInt(str.replaceAll("\\$", ""));
            total=total+odeme;
        }
        return total;
    }
    public abstract void options(String hafiza, String  ekran);
}
