package Mentoring.mentoring_3;

import java.util.Scanner;

public class For_Soru_2 {
    public static void main(String[] args) {

        // Örnek Soru: Kullanıcıdan bir ülke adı isteyin ve ülke adını aşağıdaki gibi yazdırın.

        // e
        // ye
        // iye
        // kiye
        // rkiye
        // ürkiye
        // Türkiye

        Scanner input = new Scanner(System.in);
        System.out.println("ülke adı giriniz: ");
        String str1 = input.nextLine();
        String str2 = "";

        for (int i = str1.length()-1; i >= 0; i--) {
            str2 = str1.substring(i);
            System.out.println(str2);
        }

        // 1 2 3 4 5 6 7  -> length = 7
        // T ü r k i y e
        // 0 1 2 3 4 5 6 -> index = 6

    }
}
