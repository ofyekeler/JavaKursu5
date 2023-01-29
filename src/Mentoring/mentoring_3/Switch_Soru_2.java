package Mentoring.mentoring_3;

import java.util.Scanner;

public class Switch_Soru_2 {
    public static void main(String[] args) {

        // Örnek Soru: Girilen gün numarısına karşılık gelen haftanın gününü yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.print("gün no: ");
        int gunNo = input.nextInt();

        switch (gunNo){
            case 1 : System.out.println("Pazartesi"); break;
            case 2 : System.out.println("Salı"); break;
            case 3 : System.out.println("Çarşamba"); break;
            case 4 : System.out.println("Perşembe"); break;
            case 5 : System.out.println("Cuma"); break;
            case 6 : System.out.println("Cumartesi"); break;
            case 7 : System.out.println("Pazar en sevdiğim :)"); break;
            default:
                System.out.println("Hatalı Giriş Yaptınız!!");

        }


    }
}
