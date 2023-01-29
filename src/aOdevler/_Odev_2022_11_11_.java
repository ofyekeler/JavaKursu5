package aOdevler;

import java.util.Scanner;

public class _Odev_2022_11_11_ {
    public static void main(String[] args) {
        // 1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.

        Scanner okuyucu = new Scanner(System.in);
        System.out.print("Adınız=");
        String Ad = okuyucu.next();
        System.out.print("Soyadınız=");
        String Soyad = okuyucu.next();
        System.out.println("Ad ve Soyad= " + Ad + " " + Soyad);

            /* Adınız=Faruk
               Soyadınız=YEKELER
               Ad ve Soyad= Faruk YEKELER */

        // 2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi Giriniz=");
        int Sayi = oku.nextInt();
        System.out.println("Sayi = " + Sayi);

            /* Sayi Giriniz=5
               Sayi = 5 */

        // 3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın. O meyveyi yazdırınız.

        Scanner ok = new Scanner(System.in);
        System.out.print("Sevdiğiniz bir meyveyi yazınız=");
        String Meyve = ok.next();
        System.out.println("Meyve = " + Meyve);

            /* Sevdiğiniz bir meyveyi yazınız=üzüm
               Meyve = üzüm */

        // 4- Bir int oluştur. Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.

        Scanner okuy = new Scanner(System.in);
        System.out.print("Aracınız kaç kapılı= ");
        int KapiSayisi = okuy.nextInt();
        System.out.println("Kapı Sayısı= " + KapiSayisi);

        /* Aracınız kaç kapılı= 4
           Kapı Sayısı= 4 */

        // 5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.

        Scanner okuyu = new Scanner(System.in);
        System.out.print("10 sene önce yaşadığınız şehri yazınız= ");
        String Sehir = okuyu.next();
        System.out.println("Sehir = " + Sehir);

        /* 10 sene önce yaşadığınız şehri yazınız= Ankara
           Sehir = Ankara */

        // 6- Bir string oluşturunuz. Doğum gününüzü konsola giriniz.String'i yazdırınız.

        Scanner okuyuc = new Scanner(System.in);
        System.out.print("Doğum Gününüz= ");
        String DogumTarihi = okuyuc.nextLine();
        System.out.println("Doğum Tarihi = " + DogumTarihi);

        /* Doğum Gününüz= 17 Kasım

           Doğum Tarihi = 17 Kasım */

        // 7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        // Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.

        Scanner okuyucuu = new Scanner(System.in);
        System.out.print("Banka Hesabınız Var Mı?= ");
        boolean VarMi = okuyucuu.nextBoolean();
        System.out.println("VarMi = " + VarMi);

        /* Banka Hesabınız Var Mı?= True
           VarMi = true */

        // 8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.

        Scanner okuyucuuu = new Scanner(System.in);
        System.out.print("Kilonuz= ");
        byte Kilo = okuyucuuu.nextByte();
        System.out.println("Kilo = " + Kilo);

        /* Kilonuz= 75
           Kilo = 75 */

        // 9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.

        Scanner okuyucuw = new Scanner(System.in);
        System.out.print("Boyunuz= ");
        float Boy = okuyucuw.nextFloat();
        System.out.println("Boy = " + Boy);

        /* Boyunuz= 1,78
           Boy = 1.78 */

    }
}
