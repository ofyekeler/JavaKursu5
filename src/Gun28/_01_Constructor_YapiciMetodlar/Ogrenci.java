package Gun28._01_Constructor_YapiciMetodlar;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinif;

/*1.Yol*/public Ogrenci(){ // yapıcı metodlar (Constructor Methods)
             // bu metodu aslında java kullanıyormuş ama bize göstermiyormuş.
        System.out.println("nesne oluşturuldu");
    } // nesne oluşturulurken yapmak istediklerin için burayı kullan.

/*2.Yol*/public Ogrenci(int id, String ad, String soyad, int sinif){ // yapıcı metodlar : Constructor metodlar
    this.id=id; // this.id: class'ın id'si. id: lokal değişken
    this.ad=ad;
    this.soyad=soyad;
    this.sinif=sinif;
    }
    public Ogrenci(int id, String ad, String soyad){ // sınıf ı kaldırdım. 3 parametreli metod yaptım.
      //  this.id=id;
      //  this.ad=ad;
      //  this.soyad=soyad;
        // this (metodun kendisi, yani Ogrenci demek)
      this(id,ad,soyad,0);
    }
}
