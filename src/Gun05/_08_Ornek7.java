package Gun05;

import java.util.Scanner;

public class _08_Ornek7 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("bir DOUBLE değer giriniz=");
        double deger=oku.nextDouble();

        System.out.println("deger = " + deger);

        /* bir DOUBLE değer giriniz=23,34
           deger = 23.34 */

        // DİKKAT !!! alt ekranda değeri girerken nokta (.) değil virgül (,) kullanıyoruz.
        // enter a basınca program virgülü noktaya çeviriyor.

    }
}
