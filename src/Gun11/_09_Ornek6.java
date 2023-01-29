package Gun11;

import java.util.Scanner;

public class _09_Ornek6 {
    public static void main(String[] args) {

        // Girilen bir sayıya kadar random sayı üreterek, (örnek: 8'e kadar, 8 dahil değil)
        // 2. bir sayıyla sistemin random yapacağı sayıyı tahmin etmeye çalışınız.
        // Kullanıcı bilirse "Tebrikler" yazdırınız. Bilemezse "Bilemedin ki bilemedin ki" yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Üretilecek Sayı Sınırı= ");
        int sinir = oku.nextInt();

        int tutulanSayi=(int)(Math.random()*sinir);

        System.out.print("Tahmininiz= ");
        int tahmin=oku.nextInt();

        if (tahmin==tutulanSayi)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedin ki bilemedin ki");

    }
}
