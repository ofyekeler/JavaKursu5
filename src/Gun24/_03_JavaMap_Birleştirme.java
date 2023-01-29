package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap_Birleştirme {
    public static void main(String[] args) {

        // Bir kartvizit uygulamasını 2 kişi için yapınız.

        HashMap<String,String> uKartvizit=new HashMap<>();
        uKartvizit.put("isim","Uğur Yılmaz"); // PUT, add görevi görüyor.
        uKartvizit.put("email","ugur@gmail.com");
        uKartvizit.put("adres","Çekmeköy/İstanbul");
        uKartvizit.put("telefon","05056667788");

        System.out.println("uKartvizit.get(\"isim\") = " + uKartvizit.get("isim"));
        System.out.println("uKartvizit.get(\"telefon\") = " + uKartvizit.get("telefon"));

        HashMap<String,String> aKartvizit=new HashMap<>();
        aKartvizit.put("isim","Ayşe Bayrak");
        aKartvizit.put("email","ayse@gmail.com");
        aKartvizit.put("adres","Şişli/İstanbul");
        aKartvizit.put("telefon","05059996611");

        System.out.println();

        // bu iki kartviziti nasıl bir MAP in içine atabiliriz?

        HashMap < String,HashMap<String,String> > kartvizitler=new HashMap<>();
                                                         // U ve A kartvizitleri "kartvizitler" de birleştirdim.
                                        // yukarıda ne kadar kartvizit olursa olsun hepsini tek bir yere toplar.

        kartvizitler.put("ugur",uKartvizit); // U yu "ugur" a
        kartvizitler.put("ayse",aKartvizit); // A yı "ayse" ye anahtar tanımladık.

        System.out.println("Ugur un kartviziti = " + kartvizitler.get("ugur")); // U kartvizit in tüm bilgileri
        System.out.println("Ayse nin kartviziti = " + kartvizitler.get("ayse")); // A kartvizit in tüm bilgileri

        // ayse nin adresi
        System.out.println("Ayşe nin adresi = " + kartvizitler.get("ayse").get("adres")); // ayse nin adresini aldık.

        // sadece e-mail ler
        for (Map.Entry<String,HashMap<String,String>> kv:kartvizitler.entrySet())
        System.out.println("email ler = " + kv.getValue().get("email"));
/*
   uKartvizit.get("isim") = Uğur Yılmaz
uKartvizit.get("telefon") = 05056667788

      Ugur un kartviziti = {telefon=05056667788, adres=Çekmeköy/İstanbul, email=ugur@gmail.com, isim=Uğur Yılmaz}
     Ayse nin kartviziti = {telefon=05059996611, adres=Şişli/İstanbul, email=ayse@gmail.com, isim=Ayşe Bayrak}
         Ayşe nin adresi = Şişli/İstanbul

               email ler = ayse@gmail.com
               email ler = ugur@gmail.com
*/
    }
}
