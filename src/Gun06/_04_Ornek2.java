package Gun06;

import java.util.Scanner;

public class _04_Ornek2 {
    public static void main(String[] args) {

        // Girilen bir string in sadece son harfini yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz= ");
        String cumle=oku.nextLine();
        int uzunluk=cumle.length();
        char sonHarf=cumle.charAt(uzunluk-1);
        System.out.println("sonHarf= " + sonHarf);

        /* Merhaba Dünya
           sonHarf= a */

        // 2. yöntem
        System.out.println("sonHarf= " + cumle.charAt(cumle.length()-1));
    }
}
