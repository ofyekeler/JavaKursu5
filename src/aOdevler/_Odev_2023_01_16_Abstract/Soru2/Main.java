package aOdevler._Odev_2023_01_16_Abstract.Soru2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        Sum toplama=new Sum();
        Substract cikarma=new Substract();
        Multiply carpma= new Multiply();
        Divide bolme=new Divide();

        System.out.print("Birinci sayıyı giriniz: ");
        int a=oku.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b=oku.nextInt();

        System.out.println(toplama.calculating(a,b));
        System.out.println(cikarma.calculating(a,b));
        System.out.println(carpma.calculating(a,b));
        System.out.println(bolme.calculating(a,b));
/*
Birinci sayıyı giriniz: 6
 İkinci sayıyı giriniz: 3
               Toplama: 6+3=9
               Çıkarma: 6-3=3
                Çarpma: 6*3=18
                 Bölme: 6/3=2
*/
    }
}
