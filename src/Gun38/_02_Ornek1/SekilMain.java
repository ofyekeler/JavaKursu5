package Gun38._02_Ornek1;

public class SekilMain {
/* 1- içinde name field ı olan "Sekil" isimli bir Abstract Class yazınız.
   2- Bu classın Alan ve cevre abstract metodları ve içinde Alan ve cevre nin sonucu olan
      toString somut metodu,
      sekilin adını veren getName somut metodu ve ciz isimli somut metodlarını ekleyiniz.
   3- Bu sınıftan DIKDORTGEN ve DAIRE isimli 2 class oluşturunuz.
   4- Bunlardan birer örnek main metodunda çalıştırınız. */

    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen(5,4);
        d.setName("Yeni dikdörtgen");
        d.ciz();
        System.out.println(d);

        Daire dr=new Daire(4);
        dr.setName("Yeni daire");
        dr.ciz();
        System.out.println(dr);
    }
}
/*
Yeni dikdörtgen isimli şekil çizildi.
Sekil:
name='Yeni dikdörtgen'
alan='20.0'
cevre='18.0'}
Yeni daire isimli şekil çizildi.
Sekil:
name='Yeni daire'
alan='50.26548245743669'
cevre='12.566370614359172'}
*/
