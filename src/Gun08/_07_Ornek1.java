package Gun08;

import java.util.Scanner;

public class _07_Ornek1 {
    public static void main(String[] args) {

        // Kullanıcının gireceği 2 sayıyı
        // birbirine eşit olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Birinci Sayı= ");
        int sayi1= oku.nextInt();

        System.out.print("İkinci Sayı= ");
        int sayi2= oku.nextInt();
        
        boolean esitMi=(sayi1==sayi2);
        System.out.println("esitMi = " + esitMi);

        /* Birinci Sayı= 5
           İkinci Sayı= 5
           esitMi = true */

        // 2. yöntem
        /* System.out.println("esitMi = " + (sayi==sayi2)); */

    }
}
