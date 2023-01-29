package Gun30._02_FinalVeriables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {
        Vatandas v1=new Vatandas("İsmet");
        Vatandas v2=new Vatandas("Nazmiye");
        Vatandas v3=new Vatandas("Nurhayat");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
/*
v1 = Vatandas{isim='İsmet', tcNo=1}
v2 = Vatandas{isim='Nazmiye', tcNo=2}
v3 = Vatandas{isim='Nurhayat', tcNo=3}
*/

        // öyle bir şey yapılmalı ki bu TC yi kimse değiştirememeli

    // v1.tcNo=456; FINAL değişkenlerine değer atanamadığından bu kodda hata alınır.
        // FINAL değişkenlerine sadece bir kez veri atanabiliyor
        // O da, ya tanımlarken ya da Costructor da
    }
}
    // FINAL: değer atandıktan sonra değiştirilmeyi engelliyor.
    // STATIC SAYAC ise: her yeni nesne oluşturulduğunda
                                              // yeni artan değer olmasını sağlıyor.