package Gun05;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı 1=");
        int Sayi1=oku.nextInt();

        System.out.print("Sayı 2=");
        int Sayi2=oku.nextInt();   //   tam sayı istediğimiz için nextInt oldu, DİKKAT !!!

        int toplam=Sayi1+Sayi2;
        System.out.print("toplam = " + toplam);

        /* Sayı 1=4
           Sayı 2=5
           toplam = 9 */
    }
}
