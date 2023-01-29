package Mentoring.mentoring_6;

import java.util.Scanner;

public class Method_Soru1 {
    public static void main(String[] args) {

        // Soru: Girilen cümledeki sesli harfleri sayan bir method yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("cümle giriniz: ");
        String str = input.nextLine();
        sesliHarfleriSay(str);
    }

    public static void sesliHarfleriSay(String str){
        int sayac = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'ı'
                || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'ö'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'ü'){
                sayac++;
            }
        }
        System.out.println("cümledeki sesli harf sayısı : " + sayac);

    }
}
