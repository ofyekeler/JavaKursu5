package Mentoring.mentoring_3;

import java.util.Scanner;

public class DoWhile_Soru_1 {
    public static void main(String[] args) {

        // Örnek Soru:  Kullanıcıdan PIN kodunu alan ve kod doğru ise sisteme giriş yaptıran programı yazınız.
        // Eğer PIN üç kez yanlış girerse kartı bloke ediniz.

        Scanner input = new Scanner(System.in);

        int kayitliPIN = 123;
        int hak = 1;

        do {
            System.out.print("PIN kodunu giriniz: ");
            int pin = input.nextInt();
            if(pin == kayitliPIN){
                System.out.println("Giriş Başarılı"); break;
            } else if (pin != kayitliPIN && hak != 3) {
                System.out.println("Hatalı PIN Tekrar Deneyin");
            }else {
                System.out.println("Kartınız Bloke oldu!!!");
            }
            hak++;
        }while (hak <= 3);








    }
}
