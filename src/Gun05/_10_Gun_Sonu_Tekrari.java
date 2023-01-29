package Gun05;

import java.util.Scanner;

public class _10_Gun_Sonu_Tekrari {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Boyunuz="+"  "+"ve"+"  "+"Kilonuz=");

        double boy=oku.nextDouble(); // nextDouble oldu, DİKKAT !!!

        double kilo=oku.nextDouble();

        System.out.println("Boyunuz="+boy+" "+"ve"+" "+"Kilonuz="+kilo);

        double vucutkitleindeksi=kilo/(boy*boy);
    }
}
