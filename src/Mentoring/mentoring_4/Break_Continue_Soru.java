package Mentoring.mentoring_4;

import java.util.Scanner;

public class Break_Continue_Soru {
    public static void main(String[] args) {

        // Örnek Soru: Girilen 5 sayının aşağıdaki koşullara göre toplamını yazdırınız
        // Girilen sayı negatifse işleme almasın
        // Girilen sayı 100 den büyük ise hatalı giriş yapıldı ikazı vererek program sonlansın.

        Scanner input = new Scanner(System.in);
        int sayi;

        int toplam = 0;

        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i + " .sayı: ");
            sayi = input.nextInt();

            if(sayi < 0){
                continue;
            }
            if (sayi > 100){
                System.out.println("Hatalı Giriş Yaptınız!!");
                break;
            }

            toplam += sayi;

        }

        System.out.println("toplam: " + toplam);





    }
}
