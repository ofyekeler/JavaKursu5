package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c=new Cember();
        c.ciz(); // çember çizildi

        Dikdörtgen d=new Dikdörtgen();
        d.ciz(); // dikdörtgen çizildi

        // interface lerden nesne üretilemez
        // fakat referans tipi oluşturulabilir.
        // Bu bize Polymorphism sağladı.

        ICizdirir c2=new Cember();
        c2.ciz(); // cember cizildi
        // direk olarak sadece Interface de ki
        // ismi verilmiş olanlar metodlara erişirsin.

        cizdirme(c);
        cizdirme(d);
    }
    public static void cizdirme (ICizdirir iCiz){
        iCiz.ciz();
    }
}
