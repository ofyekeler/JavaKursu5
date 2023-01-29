package Gun12;

import java.util.Scanner;

public class _06_Ornek3 {
    public static void main(String[] args) {

        // Girilen bir sayının birler basamağının değerini yazı ile yazdırınız.
        // örn: 234 -> 4   dört

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        int sayi= oku.nextInt();

        int birlerBasamagi=sayi%10; // kalan sayıyı verir,
                                    // 10'a bölersen kalanı aslında birler basamağını verir
        switch (birlerBasamagi) {
            case 0: System.out.println("sıfır");break;
            case 1: System.out.println("bir");break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("üç");break;
            case 4: System.out.println("dört");break;
            case 5: System.out.println("beş");break;
            case 6: System.out.println("altı");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekiz");break;
            case 9: System.out.println("dokuz");break;
        }
        // Kural: Bir sayıdan herhangi bir rakamı almak istiyorsan:
        // istediğin rakam sonda kalacak şekilde böl, sonra da modül 10 al.

        /* Sayı giriniz= 234
           dört */

    }
}
