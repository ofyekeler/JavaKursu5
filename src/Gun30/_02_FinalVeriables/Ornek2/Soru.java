package Gun30._02_FinalVeriables.Ornek2;

import java.util.Scanner;

public class Soru {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {
    int gun=0;
    int saat=0;
    int dakika=0;

    Scanner oku=new Scanner(System.in);
    System.out.print("Gün= "); gun=oku.nextInt();
    System.out.print("Saat= "); saat=oku.nextInt();
    System.out.print("Dakika= "); dakika=oku.nextInt();

    // sadece string 'null' alabilir. int alamaz.

    // 1. Yöntem
    int toplamSaniye=
            gun*Sabitler.birGundekiSaatSayisi
               *Sabitler.birSaattekiDakikaSayisi
               *Sabitler.birDakikadakiSaniyeSayisi
               +
               saat
               *Sabitler.birSaattekiDakikaSayisi
               *Sabitler.birDakikadakiSaniyeSayisi
               +
               dakika
               *Sabitler.birDakikadakiSaniyeSayisi;
        System.out.println("toplamSaniye = " + toplamSaniye);

    // 2. Yöntem

        System.out.println("Sabitler.hesapla(gun,saat,dakika) = " + Sabitler.hesapla(gun,saat,dakika));

/*
                               Gün= 3
                              Saat= 3
                            Dakika= 3
                     toplamSaniye = 270180
Sabitler.hesapla(gun,saat,dakika) = 270180
*/
    }
}
