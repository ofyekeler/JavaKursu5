package Mentoring.mentoring_2;

import java.util.Scanner;

public class Operators_Soru_2 {
    public static void main(String[] args) {

        // ORNEK SORU: Girilen sayının birler basamağının çift sayı ve sıfırdan büyük olup olmadığını bulunuz

        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz: ");

        int num = input.nextInt();
        int basamak = num % 10;  // birler basamağına ulaştık

        //1.yöntem
        System.out.println("birler basamağı çift ve sıfırdan büyük mü: " + (basamak % 2 == 0 && basamak > 0 ) );

        // 2.yöntem
        boolean b = (basamak % 2 == 0 && basamak > 0 );
        System.out.println("birler basamağı çift ve sıfırdan büyük mü: " + b);





    }
}
