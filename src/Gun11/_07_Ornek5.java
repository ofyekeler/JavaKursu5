package Gun11;

import java.util.Scanner;

public class _07_Ornek5 {
    public static void main(String[] args) {

        // Math.max yöntemi ile girilen 3 sayıdan en büyük olanı bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı 1= ");
        int sayi1 = oku.nextInt();
        System.out.print("Sayı 2= ");
        int sayi2 = oku.nextInt();
        System.out.print("Sayı 3= ");
        int sayi3 = oku.nextInt();

        System.out.println("En Büyük Sayı= " + Math.max(sayi1, Math.max(sayi2, sayi3)));
        
        // 2. yöntem
        
        int enBuyuk=Math.max(sayi1, sayi2);
        enBuyuk=Math.max(enBuyuk, sayi3);
        System.out.println("enBuyuk = " + enBuyuk);

        /* Sayı 1= 5
           Sayı 2= 6
           Sayı 3= 7
           En Büyük Sayı= 7
           enBuyuk = 7 */

    }
}
