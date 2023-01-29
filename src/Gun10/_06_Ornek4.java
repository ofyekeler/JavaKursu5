package Gun10;

import java.util.Scanner;

public class _06_Ornek4 {
    public static void main(String[] args) {

        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // Kurallar:
        // En az 8 karakter olmalı,
        // içinde PASS kelimesi olmamalı,
        // en fazla 12 karakter olmalı.
        // (string i küçük karaktere çevirerek yap)

        Scanner oku=new Scanner(System.in);
        System.out.print("Password= ");
        String password=oku.nextLine();
         if (password.length()>=8 && password.length()<12 && password.toLowerCase().contains("pass")==false)
             System.out.println("Uygundur");
         else
             System.out.println("Uygun Değildir");

        /* Password= paswords
           Uygundur

           Password= password
           Uygun Değildir*/

    }
}
