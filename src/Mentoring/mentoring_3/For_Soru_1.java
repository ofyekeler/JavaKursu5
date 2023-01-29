package Mentoring.mentoring_3;

import java.util.Scanner;

public class For_Soru_1 {
    public static void main(String[] args) {

        // For Döngüsü: Başlangıç, bitiş değeri belli ve artış miktarı belli olan işlemlerde kullanılır.


        // Örnek Soru : Girilen bir string de kaç tane 'a' harfi olduğunu yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("bir ifade giriniz: ");
        String ifade = input.nextLine();

        int sayac = 0;

        for (int i = 0; i < ifade.length(); i++) {
            if(ifade.charAt(i) == 'a'){
                sayac++;
            }
        }
        System.out.println("ifadedeki a sayısı: " + sayac);



    }
}
