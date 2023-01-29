package Gun06;

import java.util.Scanner;

public class _01_Ornek1 {
    public static void main(String[] args) {

        // Kullancıdan Cadde, Sokak, PostaKodu(int) ve Ülke şeklinde adres bilgisi alarak yazınız.

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        System.out.print("Cadde= ");
        String cadde=okuStr.nextLine();

        System.out.print("Sokak= ");
        String sokak=okuStr.nextLine();

        System.out.print("Posta Kodu= ");
        int postaKodu=okuInt.nextInt();

        System.out.print("Ulke= ");
        String ulke=okuStr.nextLine();

        System.out.println("Adres= " + cadde+" "+sokak+" "+postaKodu+" "+ulke);

        /*Cadde= Selçuklu
          Sokak= 27.
          Posta Kodu= 06010
          Ulke= Türkiye
          Adres= Selçuklu 27. 6010 Türkiye */

    }
}
