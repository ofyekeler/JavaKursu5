package Gun35._03_Polymorphism_InstanceOf;

public class OkulMain {
   /* 1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli olacak
kimlik belgesi formu oluşturan tek bir metod yazınız.

            OkulMain */
   public static void main(String[] args) {
       Ogrenci ogr=new Ogrenci("Ayşe","Yılmaz","Öğrenci","5A");
       Calisan cal=new Calisan("Ali","Yılmaz","Yazılım","BIM");

       Kisi.kimlikYaz(ogr);
       Kisi.kimlikYaz(cal);
   }
}
/*
***** Kimlik Belgesi *****
ad = Ayşe
soyad = Yılmaz
görevi = Öğrenci
Şubesi: 5A

***** Kimlik Belgesi *****
ad = Ali
soyad = Yılmaz
görevi = Yazılım
Departmanı: BIM
*/