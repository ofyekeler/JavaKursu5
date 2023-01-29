package Gun11;

import java.util.Scanner;

public class _02_Ornek2 {
    public static void main(String[] args) {

        // Otopark ücretleri:
        // 3 saate kadar ₺10, 5 saate kadar ₺15, 5 saatten fazlaysa ₺20'dir.
        // kullanıcıdan kac saat kaldığını alarak ücreti yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Kaç Saat= ");
        int saat= oku.nextInt();

        if (saat<=3)
            System.out.println("₺10");
        else
            if (saat<=5)
                System.out.println("₺15");
            else // bunlar da değilse, kalan saatler için ₺20 diyor.
                System.out.println("₺20");

    }
}
