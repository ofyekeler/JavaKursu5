package Mentoring.mentoring_9.inheritance_ornek1;

public class Main {
    public static void main(String[] args) {

        // INHERİTANCE : Bir classın tüm field ve methodlarını diğer bir classın kalıtım yoluyla devralmasıdır.
        // extend keyword ile kullanılır.
        // Super Class/Parent Class --> temel olan ana sınıftır
        // Sub Class/Child Class --> miras alan sınıftır.
        // Daha az kod ile daha kapsamlı projeler geliştirmemizi sağlar.
        // Override işlemi ile metodları ihytiyaca göre yeniden kullanma kolaylığı sağlar.

        Calisan calisan = new Calisan("Efe Yılmaz", 15, 123456, "Ankara", 22.50, "muhasebe");
        System.out.println(calisan);

        System.out.println();
        Yonetici yonetici = new Yonetici("Cem Deniz", 41, 456789, "İstanbul", 0, "Bilgi İşlem");
        System.out.println(yonetici);
    }
}
