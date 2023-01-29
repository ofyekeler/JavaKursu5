package Gun29._04_Ornek1;

public class Banka {
    // Hesap (yatan(int), cekilen(int), bakiye(int))
    // Musteri (musteriNo(int), ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
    // Müşterinin toplam yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
    // bakiyeye direk para atanamadıgını kontrol ediniz.
    public static void main(String[] args) {

        Musteri mus1=new Musteri();
        mus1.musteriNo=1;
        mus1.ad="metin";
        mus1.soyad="demir";

        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraCek(50);
        mus1.musteriHesap.paraCek(25);

        System.out.println(mus1.musteriHesap);
/*
Hesap{
yatan=200,
cekilen=75,
bakiye=125}
*/
    }
}
