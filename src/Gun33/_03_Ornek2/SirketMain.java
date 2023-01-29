package Gun33._03_Ornek2;

public class SirketMain {
   /* Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
      consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.
      GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
      GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
      SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
          maaşları hesaplatıp, bordroyu yazdırınız. */
   public static void main(String[] args) {

      Calisan calisan1=new Calisan("İsmet", 10000, 1.2);
      System.out.println(calisan1);

      GenelMudur genelMudur1=new GenelMudur("Nihat",12000,1.8,1000);
      System.out.println("genelMudur1 = " + genelMudur1);
   }
/*
Calisan{isim= 'İsmet', maas= 10000.0, maasKatSayisi= 1.2, ödenecek maas= 12000.0}
genelMudur1 = GenelMudur{isim= 'Nihat', maas= 12000.0, maasKatSayisi= 1.8, tazminat= 1000.0,
                                                                     ödenecek maas= 22600.0}
*/
}
