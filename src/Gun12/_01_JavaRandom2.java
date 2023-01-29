package Gun12;

import java.util.Scanner;

public class _01_JavaRandom2 {
    public static void main(String[] args) {
        
        // 0-5 arası gibi sayıları bir önceki ders ürettik, hep sıfırdan başladı.
        // 4-9 arası nasıl ürettirirdim?
        // Yöntem şu: Önce aralık kadar sayıyı üret. Mesela 9 - 4 arası gibi.
        // üretilen sayıya min, yani 4'ü ekle.
        // (int)(Math.random()*(max-min))+min
        
        // Örnek:
        // Girlen max ve min aralığında random sayı ürettiriniz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Min Sayı= ");
        int min=oku.nextInt();

        System.out.print("Max Sayı= ");
        int max= oku.nextInt();
        
        int rndSayi=(int)(Math.random()*(max-min))+min; //   4 <= x < 9
        System.out.println("rndSayi = " + rndSayi);

        /* Min Sayı= 4
           Max Sayı= 9
           rndSayi = 5 */
        
    }
}
