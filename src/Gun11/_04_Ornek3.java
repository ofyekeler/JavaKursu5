package Gun11;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {

        // Girilen sayı 50 den büyük ise 1, değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı= ");
        int sayi= oku.nextInt();

        int sonuc=(sayi>50) ? 1 : 0;  //  ?  -> if
        // : ->  else demek.
        System.out.println("sonuc = " + sonuc);

    }
}
