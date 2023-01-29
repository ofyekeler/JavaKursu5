package Gun36._06_Interface;

public class GeometriMain {
    /* Kare, Dikdortken sınıflarından oluşacak bir geometri programı
yapılmak isteniyor.bunların ayrı ayrı , fakat ortak metodlarının
(cevresi() ve alani() )zorunlu olabilmesi için gerekli yapıyı kurunuz ve yazınız.
 */
    public static void main(String[] args) {

        Dikdörtgen d1=new Dikdörtgen();

        System.out.println(d1.cevresi(2,3)); // 10,0
        System.out.println(d1.alani(2,3)); // 6,0

        Kare k1=new Kare();
        System.out.println(k1.cevre(5)); // 20,0
        System.out.println(k1.alan(5)); // 25,0

    }
}
