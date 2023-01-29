package Gun11;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {

        // Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        // olduğunu Ternary Operatör ile yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı= ");
        int sayi = oku.nextInt();

        String sonuc = (sayi > 0) ? "pozitif" : (sayi < 0) ? "negatif" : "sıfır";
        System.out.println("Sonuç = " + sonuc);

    }
}
