package Gun33._02_Ornek1;

public class HayvanatBahcesiMain {

    //    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
    //    Kediler için (renk,kilo,cinsi)
    //    kopekler için (renk,kilo, cinsi)
    //    yılanlar için renk, kilo, cinsi, uzunluk)
    //    ordek için (renk, kilo, cinsi, kanatAcikligi)
    //    bütün hayvanların konustu metodu vardır.

    public static void main(String[] args) {

        Kopek kopek1=new Kopek("Beyaz",50,"Kangal");
        kopek1.konustu();
/* Havladı. */
        Kedi kedi1=new Kedi("Siyah",3,"Tekir");
        kedi1.konustu();
/* Miyavladı. */
        Ordek ordek1=new Ordek("Siyah",3,"Gövel",90);
        ordek1.konustu();
/* Vak vak ladı. */
        Yılan yılan1=new Yılan("Yeşil",3, "Engerek",300);
        yılan1.konustu();
/* Tısladı. */
    }
}
