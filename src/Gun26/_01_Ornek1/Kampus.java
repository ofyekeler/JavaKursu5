package Gun26._01_Ornek1;

public class Kampus {
    public static void main(String[] args) {

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="ismet temur";

        // 1. yöntem (tanımlayıp doldurduk)
        ogr.okulu=new Okul();
        ogr.okulu.adi="Mehmet Akif Ersoy Okulu";
        ogr.okulu.mudurAdi="Merve Aslan";
        ogr.okulu.ucreti=50000;

        // 2. yöntem (doldurup tanımladık)
        Okul ok=new Okul();
        ok.adi="Mehmet Akif Ersoy Okulu";
        ok.mudurAdi="Merve Aslan";
        ok.ucreti=50000;
        ogr.okulu=ok; // "ok" a atıp, finalde "okul" a aktardık.

        System.out.println("okulNo = " + ogr.okulNo);
        System.out.println("tamAd = " + ogr.tamAd);
        System.out.println("okulu.adi = " + ogr.okulu.adi);
        System.out.println("okulu.mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("okulu.ucreti = " + ogr.okulu.ucreti);
/*
        okulNo = 1
         tamAd = ismet temur
     okulu.adi = Mehmet Akif Ersoy Okulu
okulu.mudurAdi = Merve Aslan
  okulu.ucreti = 50000.0
*/
    }
}
