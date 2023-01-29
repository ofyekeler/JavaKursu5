package Gun09;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {

        // Girilen bir öğrenci notuna göre 50'den büyük/eşit ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Ders Notu= ");
        int dersnotu= oku.nextInt();

        if (dersnotu>=50) // ise
            System.out.println("Geçtiniz");

        if (dersnotu<50) // ise
            System.out.println("Kaldınız");

        /* Ders Notu= 51
           Geçtiniz
           Ders Notu= 49
           Kaldınız
           Ders Notu= 50
           Geçtiniz */
}
}
