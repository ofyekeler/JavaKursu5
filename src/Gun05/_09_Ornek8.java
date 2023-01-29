package Gun05;

import java.util.Scanner;

public class _09_Ornek8 {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazdırınız.
        // vücut kitle indeksini de bularak yazdırınız. (kg/boy*boy) Boy: 1.78, Kilo: 75

        Scanner oku=new Scanner(System.in);

        System.out.print("Boyunuz=");
        double Boy=oku.nextDouble(); // nextDouble oldu, DİKKAT !!!

        System.out.print("Kilonuz=");
        double Kilo=oku.nextDouble();

        System.out.println("Boyunuz="+Boy+" "+"ve"+" "+"Kilonuz="+Kilo);

        double vucutkitleindeksi=Kilo/(Boy*Boy);

        System.out.println("vucutkitleindeksi = " + vucutkitleindeksi);

        /*Boyunuz=1,78
          Kilonuz=75
          vucutkitleindeksi = 23.671253629592222 */
    }
}
