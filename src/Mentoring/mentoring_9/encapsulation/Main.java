package Mentoring.mentoring_9.encapsulation;

public class Main {
    public static void main(String[] args) {

        // ENCAPSULATİON : Bir class değişkenlerini private keyword ile diğer bir classtan gizlemek için kullanılır.
        // Yanlızca kendi classı içinde getter ve setter metodlarıyla erişim sağlanabilir.
        // Okuma işlemleri için get, değişiklik ve koşul işlemleri için set metodları kullanılır.
        // Avantajları -> veri gizleme/koruma ve sınırlı erişim, ihtiyacımıza göre metodlarda okuma ve değişiklik kolaylığı sağlar.


        // Okul içinde yabancı dil kursları oluşturmak istiyoruz. Öğrenciler için dil kursu açıyoruz

        Okul okul = new Okul("Mehmet Akif Koleji");

        System.out.println(okul);  // liste boş çünkü henüz kurs eklemedik.

        Kurs kurs1 = new Kurs("İngilizce", 35);
        okul.kursEkle(kurs1);

        System.out.println();
        System.out.println("ingilizce kursu: " + kurs1);
        System.out.println(okul);

        System.out.println();
        Kurs kurs2 = new Kurs("Almanca", 20);
        okul.kursEkle(kurs2);

        System.out.println(okul);
    }
}
