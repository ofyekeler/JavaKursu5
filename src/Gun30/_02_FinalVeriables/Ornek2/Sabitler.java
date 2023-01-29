package Gun30._02_FinalVeriables.Ornek2;

public class Sabitler {
    final static int birGundekiSaatSayisi=24;
    final static int birSaattekiDakikaSayisi=60;
    final static int birDakikadakiSaniyeSayisi=60;
    // genel ve değiştirilmesi gereken değerler olmadığı için
      // FINAL ve STATIC kullandık.

/*2.Yön*/public static int hesapla(int gun, int sa, int dk){
        int toplamSaniye=
                gun*Sabitler.birGundekiSaatSayisi
                        *Sabitler.birSaattekiDakikaSayisi
                        *Sabitler.birDakikadakiSaniyeSayisi
                        +
                        sa
                                *Sabitler.birSaattekiDakikaSayisi
                                *Sabitler.birDakikadakiSaniyeSayisi
                        +
                        dk
                                *Sabitler.birDakikadakiSaniyeSayisi;
        return toplamSaniye;
    }
}
