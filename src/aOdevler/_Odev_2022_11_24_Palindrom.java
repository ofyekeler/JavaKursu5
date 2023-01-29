package aOdevler;

import java.util.Scanner;

public class _Odev_2022_11_24_Palindrom {
    public static void main(String[] args) {

  // Aşağıdaki tüm sorularda sayı okutuldukdan sonra sayı formatı ile
    // çözmeye çalışalım, yani Stringe çevirerek değil.
    // elbette daha sonra String çevirimi ile de çözebilirsiniz.

        // Q1- Kullanıcının gireceği 5 sayıdan tek olanlarının toplamını bulunuz

        Scanner oku01= new Scanner(System.in);

        int toplam01=0;
        int sayac01=1;
        while (sayac01<=5){
            System.out.print(sayac01+". "+"Sayıyı Giriniz= ");
            int sayi01= oku01.nextInt();
            int modul01=sayi01%2;
            if (modul01==1)
                toplam01=toplam01+sayi01;
            sayac01++;
        }
        System.out.println("Tek Sayıların Toplamı= " + toplam01);

        // Q2- Kullanıcının gireceği 5 sayıdan kaç tanesinin tek olduğunu bulunuz

        Scanner oku02= new Scanner(System.in);

        int toplam02=0;
        int sayac02=1;
        while (sayac02<=5){
            System.out.print(sayac02+". "+"Sayıyı Giriniz= ");
            int sayi02= oku02.nextInt();
            int modul02=sayi02%2;
            if (modul02==1)
                toplam02=toplam02+1;
            sayac02++;
        }
        System.out.println("Tek Sayıların Adet Toplamı= " + toplam02);

        // Q3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        Scanner oku03= new Scanner(System.in);
        System.out.print("Sayıyı Giriniz= ");
        int sayi03= oku03.nextInt();
        int toplam03=0;
        while (1<=sayi03) {
            toplam03=toplam03+sayi03;
            sayi03--; // sayac=sayac+1
        }
        System.out.println("Sayının Ardışık Toplamı= " + toplam03);

        // Q4- Kullanıcının gireceği 5 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner oku04=new Scanner(System.in);

        int toplam04=0;
        int sayac04=1;
        do {
            System.out.print(sayac04+". "+"Sayıyı Giriniz= ");
            int sayi04= oku04.nextInt();
            if (10<sayi04 && sayi04<30)
                toplam04=toplam04+sayi04;
            sayac04++;
        } while (sayac04<=5);
        System.out.println("10<sayi<30 olanların toplamı= " + toplam04);

        // Q5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        int sayac5 = 0;
        int birlerbas5 = 0;

        while (sayac5<100){


            if (sayac5%10==5)
                birlerbas5++;
            sayac5++;
        }

        System.out.println("Birler Basamağı= " + birlerbas5);

        // Q6- Bir sayı bulmaca oyunu yapılmak isteniyor
            // bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
            // Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
            // bilemediniz yazıp tutulan sayıyı bildirsin.
            // Eğer bilirse tebrikler yazsın.

        int minSayi06= 10;
        int maxSayi06= 20;
        int sayac06= 1;

        int tutulanSayi06=(int)(Math.random()*(maxSayi06-minSayi06))+minSayi06; //   10 <= x < 20

        Scanner oku06=new Scanner(System.in);

        while (sayac06<=3) {
            System.out.print(sayac06+". "+"Tahmininiz= ");
            int tahmin01=oku06.nextInt();
            sayac06++;
            if (tutulanSayi06==tahmin01)
                System.out.println("Tebrikler");
            else
                System.out.println("Bilemediniz");}
        System.out.println("Doğru Sayı= " + tutulanSayi06);

// Mobil developer kursuna devam edecekler ve kendini zorlamak isteyen testerlar için

        // Q7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

        Scanner oku07=new Scanner(System.in);
        System.out.print("Üç Basamaklı Sayı Giriniz= ");
        int sayi07=oku07.nextInt();
        int modulBir=sayi07%10;
        int modulOn=(sayi07%100)/10;
        int modulYuz=(sayi07%1000)/100;

        System.out.println("Birler Basamağı: "+modulBir+"\t"+"Onlar Basamağı: "+modulOn+
                            "\t"+"Yüzler Basamağı: "+modulYuz);

        // Q8- Girilen bir sayının kaç basamak olduğunu bulunuz.

        Scanner oku08= new Scanner(System.in);
        int sayac08 = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi08 = oku08.nextInt();

        while(sayi08 > 0) {
            sayi08 /= 10; // sayi = sayi / 10;
            sayac08++;
        }
        System.out.println("Girilen sayının basamak sayısı= " + sayac08);

        // Q9- Girilen bir sayının tersi olan sayıyı bulunuz
            // yani 124 girildi ise 421 olan sayı elde edilecek.

        Scanner oku09 = new Scanner(System.in);

        System.out.print("Sayı Giriniz= ");
        int sayi09 = oku09.nextInt();

        System.out.print("Girdiğiniz sayinin tersten yazılısı= ");

        while(sayi09 > 0) {

            System.out.print(sayi09 % 10);
            sayi09 /= 10; // sayi09=sayi09/10
        }

        // Q10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz.
        // yani simetrik (palindrom) sayı mı?

        Scanner oku10=new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi10= oku10.nextInt();
        int sayi11=sayi10*1;
        int tersSayi=0;

        do {
            int kalan = sayi11%10;
            tersSayi=tersSayi*10+kalan;
            sayi11/=10;
        }while ((sayi11 != 0));

        System.out.println("sayi10 = " + sayi10);

        System.out.println("terssayi = " + tersSayi);


        if (sayi10==tersSayi)
            System.out.println("sayi polindrom dur");
        else
            System.out.println("sayi polindrom değildir");

        /* 12321

           kalan=1
           terssayı=1
           sayi=1232

           kalan=2
           terssayı=12
           sayi=123

           kalan=3
           terssayı=123
           sayi=12

           kalan=2
           terssayı=1232
           sayi=1

           kalan=1
           terssayı=12321
           sayi=0 */
    }
}
