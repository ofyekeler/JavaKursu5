package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_Ornek3 {
    public static void main(String[] args) {

        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner oku=new Scanner(System.in);
        int dizi[]=new int[5];

        for (int i=0;i<5;i++)
        {
            System.out.print(i+".sayi= ");
            dizi[i]= oku.nextInt();
        }
        System.out.println(Arrays.toString(dizi));

        enKucukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamaYaz(dizi);
    }
    public static void enKucukYaz(int[]sayi){

        Arrays.sort(sayi);
        System.out.println("enkucuk= " + sayi[0]);
    }
    public static void enBuyukYaz(int[]sayi){

        Arrays.sort(sayi);
        System.out.println("enbuyuk= " + sayi[sayi.length-1]);
    }
    public static void ortalamaYaz(int[]sayi){

        int toplam=0;
        int ortalama=0;
        for (int i : sayi)
        {
            toplam+=i;
            ortalama=toplam/(sayi.length-1);
        }
        System.out.println("ortalama= "+ortalama);
    }
/*
0.sayi= 1
1.sayi= 2
2.sayi= 5
3.sayi= 4
4.sayi= 3
[1, 2, 5, 4, 3]
enkucuk= 1
enbuyuk= 5
ortalama= 3
*/
}
