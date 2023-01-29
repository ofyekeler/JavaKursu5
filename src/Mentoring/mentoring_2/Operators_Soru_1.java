package Mentoring.mentoring_2;

import java.util.Scanner;

public class Operators_Soru_1 {
    public static void main(String[] args) {

        // ORNEK SORU: Girilen bir sayının tek sayı olup olmadığını yazdırınız?

        Scanner input = new Scanner(System.in);

        System.out.print("sayı giriniz: ");

        int num = input.nextInt();

        //1. Yöntem

        boolean sonuc = (num % 2 == 1);
        System.out.println("sonuc: " + sonuc);  // pozitif sayılar için doğru çalışır

        // 2. yöntem
        System.out.println("sayı tek mi: " + (num % 2 != 0));  // negatif sayılarda doğru çalışır


    }
}
