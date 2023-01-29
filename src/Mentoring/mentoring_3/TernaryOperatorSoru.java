package Mentoring.mentoring_3;

import java.util.Scanner;

public class TernaryOperatorSoru {
    public static void main(String[] args) {

        // ÖRNEK SORU: Girilen bir sayının pozitif olup olmadığını, pozitifse çift sayı olup olmadığını yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("sayı: ");
        int a = input.nextInt();

        // 1. yöntem
        System.out.println(a >= 0 ? (a % 2 == 0 ? "sayı çift" : "sayı tek") : "sayı negatif");

        boolean bln = a >= 0 ? (a % 2 == 0 ? true : false) : false;

        System.out.println("sayı sıfırdan büyük ve çift mi: " + bln);

    }
}
