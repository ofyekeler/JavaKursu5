package Gun20;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {

        // kullanıcının gireceği 2 sayının toplamını
        // bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz= ");
        int sayi1= oku.nextInt();
        System.out.print("2. sayıyı giriniz= ");
        int sayi2= oku.nextInt();

        int top=toplam(sayi1,sayi2);
        System.out.println("Sayıların Toplamı= " + top);
    }
    public static int toplam(int s1, int s2) {

        return s1+s2;
    }
/*
1. sayıyı giriniz= 5
2. sayıyı giriniz= 15
Sayıların Toplamı= 20
*/
}