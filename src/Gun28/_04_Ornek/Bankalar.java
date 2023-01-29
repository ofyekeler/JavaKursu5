package Gun28._04_Ornek;

public class Bankalar {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.
    public static void main(String[] args) {
        Banka b1 = new Banka("Ziraat", 1861, 1863);
        Banka b2 = new Banka("Garanti", 500);
        Banka b3 = new Banka();

        System.out.println("b1 = " + b1); // içinde 'toString' GİZLİ
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
    }
/*
b1 = Banka{adi='Ziraat', subeSayisi=1861, kurulusYili=1863}
b2 = Banka{adi='Garanti', subeSayisi=500, kurulusYili=0}
b3 = Banka{adi='null', subeSayisi=0, kurulusYili=0}
*/
}
