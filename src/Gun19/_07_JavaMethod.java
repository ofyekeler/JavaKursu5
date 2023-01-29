package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(60);

        // Kullanıcıdan sayı alarak onu tek mi çift mi yazdıralım.
        tekMiCiftMiOku();
    }
    public static void tekMiCiftMi(int sayi) {
        if (sayi%2 !=0)
            System.out.println("tek");
        else
            System.out.println("çift");
    }
    public static void tekMiCiftMiOku() {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        int sayi=oku.nextInt();

        tekMiCiftMi(sayi);   // 2. public de ki parametreyi aldık.

        // ya da 2. parametreyi almak yerine uzun bir şekilde;

        //if (sayi%2 !=0)
        //System.out.println("tek");
        //else
        //System.out.println("çift");

                                                    // derdik
    }
/*
tek
çift
Sayı giriniz= 12
çift
*/
}
