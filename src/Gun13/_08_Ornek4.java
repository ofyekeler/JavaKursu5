package Gun13;

import java.util.Scanner;

public class _08_Ornek4 {
    public static void main(String[] args) {

        // Kullanıcıdan x girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku= new Scanner(System.in);
        String karakter;
        do {
            System.out.print("Karakter Giriniz= ");
            karakter=oku.next();
            System.out.println("Program çalışıyor");
        }while(!karakter.equalsIgnoreCase("x"));
        System.out.println("Program bitti");

        /* Karakter Giriniz= a
           Program çalışıyor
           Karakter Giriniz= s
           Program çalışıyor
           Karakter Giriniz= a
           Program çalışıyor
           Karakter Giriniz= x
           Program çalışıyor
           Program bitti */

    }
}
