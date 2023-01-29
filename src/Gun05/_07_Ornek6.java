package Gun05;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {
        // Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip
        // çevresini ve alanını bulunuz ve yazdırınız. cevre=a+a+b+b, alan= a*b, a=4, b=5 olsun.

        Scanner oku=new Scanner(System.in);

        System.out.print("A Kenarı="); // soruyu soruyor
        int AKenari=oku.nextInt();     // cevap istiyor
        System.out.print("B Kenarı="); // soruyu soruyor
        int BKenari=oku.nextInt();     // cevap istiyor

        int cevre=AKenari+AKenari+BKenari+BKenari;
        int alan=AKenari*BKenari;

        System.out.println("Çevre = " + cevre);
        System.out.println("Alan = " + alan);

        /* A Kenarı=4
           B Kenarı=5
           Çevre = 18
           Alan = 20 */
    }
}
