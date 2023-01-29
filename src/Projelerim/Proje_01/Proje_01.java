package Projelerim.Proje_01;

import java.util.Scanner;

public class Proje_01 {
    public static void main(String[] args) {

        // 1- Scanner class tanimlayin...

            // Kullanicidan ismini girmesini isteyin ve girilen ismin ilk hafrini buyuk harfe donusturun...


        // 2- Kullanicinin girdigi ismi ekrana yazdirarak, " Ahmet hosgeldin, soyismini girer misin?" diye soralim...


            // Kullanici nin ismini ve soyismini ilk harfi buyuk digerleri kucuk olacak sekilde yazdiralim...

        // 3- Ekranda gorulen isim soyisim dogru ise "Y" tusuna basarak devam edilecek sekilde dongu olusturalim...

            // Eger kullanici "Y" haricinde bir tusa basarsa "Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin..."

            // ikazi verelim

            // Kullaniciyi tekrar "Y" tusuna basana kadar donguye devam edelim...

            // Kullanici "Y" tusuna bastiginda "Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir..."

            // ikazi verelim


        // 4- Kullanici adi belirleme adimi ile devam edelim ->" Lutfen kullanici adnizi belirleyin...:"


        // 5- Sifre belirleme ile devam edelim...->" Lutfen sifrenizi belirleyiniz...:"

            // Sifre tekrar girilmelidir -> " Sifrenizi tekrar giriniz...:"

            // Girilen iki sifre birbiri ile ayni olmalidir... Degilse "Yanlis veya hatali bir sifre girdiniz,

            // lutfen tekrar deneyin..." ikazi verelim

            // Sifreler birbiri ile ayni ise "Tebrikler... "+ username + " kullanici adiyla sisteme kayit oldunuz..."

            // ikazi verelim...

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz: ");
        String isim= oku.nextLine();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        System.out.print(isim+" hosgeldin, soyismini girer misin? : ");
        String soyisim= oku.nextLine();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        System.out.print(isim + " " + soyisim + " isminiz doğru ise devam etmek için'Y' tuşuna basınız...: " );
        boolean dogrumu=false;
        do {

            String harf=oku.nextLine();
            if (!harf.equalsIgnoreCase("y"))
                System.out.print("Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin...: ");
            else if (harf.equalsIgnoreCase("y")) {
                dogrumu=true;
                System.out.println("Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir...");
            }
        }while(dogrumu==false);

        System.out.print("Lutfen kullanici adnizi belirleyin...: ");
        String username= oku.nextLine();

        boolean sifre=false;
        do {

            System.out.print("Lutfen sifrenizi belirleyiniz...: ");
            String sifre1= oku.nextLine();
            System.out.print("Sifrenizi tekrar giriniz...: ");
            String sifre2= oku.nextLine();

            if (!sifre1.equals(sifre2))
                System.out.println("Yanlis veya hatali bir sifre girdiniz, lutfen tekrar deneyin...: ");

            else
                sifre=true;
        }while(sifre==false);

        System.out.println("Tebrikler... " + username + " kullanici adiyla sisteme kayit oldunuz...");
    }
}
