package Mentoring.mentoring_3;

public class Switch_Soru_1 {
    public static void main(String[] args) {

        // Switch : Koşula bağlı durumlarda birçok if-else bloğu yazmak yerine kullanıyoruz.
        // çalışırken switch bir kez değenlendirilir anahtar kelime için koşulu sağlayan case bloğu çalışır
        // her case den sonra break eklenir.

        // Örnek Soru:  100' e kadar olan sayılardan random bir sayının birler basamağını yazdırınız.

        int sayi = (int)(Math.random() * 100);
        System.out.println("sayı : " + sayi);

        int basamak = sayi % 10;

        switch (basamak){
            case 0 :System.out.println("sıfır"); break;
            case 1 :System.out.println("bir"); break;
            case 2 :System.out.println("iki"); break;
            case 3 :System.out.println("üç"); break;
            case 4 :System.out.println("dört"); break;
            case 5 :System.out.println("beş"); break;
            case 6 :System.out.println("altı"); break;
            case 7 :System.out.println("yedi"); break;
            case 8 :System.out.println("sekiz"); break;
            case 9 :System.out.println("dokuz"); break;
        }

    }
}
