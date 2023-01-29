package Gun04;

public class _07_IntegerParseInt_ToString_SayiKelimeCevirme {
    public static void main(String[] args) {
        // şu ana kadar, sayilari birbirine çevirdik.
        // yazıların rakamlara çevrilmesi, rakamların yazıya çevrilmesi var
        // excel de ki metin formatında rakam yazmayla, sayı formatında rakam yazma gibi

        /* String ...=5
           int ,,, = Integer.parseInt(...)
          tam tersi için de
        String *** = Integer.toString(,,,)  */

        String ad="Faruk"; // bu string rakama zaten dönüşemez. Ama,,,
        String kelimeSayi="65"; // bu stringdeki sayı, rakama dönüşür.

        int sayiDeger= Integer.parseInt(kelimeSayi); // sayıya dönüştürür "Integer.parseInt()"
                 // parse -> ayrıştırma, çözümleme anlamı var. Türkçede ki parsellemek gibi...

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        // toplam = 130


        // toplam şu anda int yani sayı, bunu String e nasıl dönüştürürüm?
        String strToplam= Integer.toString(toplam); // String e dönüştürür "Integer.toString()"
        System.out.println("strToplam = " + strToplam);

        // strToplam = 130
    }
}
