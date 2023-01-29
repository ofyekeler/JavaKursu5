package Gun32._02_Ornek1;

public class ArabaMain {
    // Bir araba nesnesi oluşturulmak isteniyor.
    // Field (Renk, Model, MotorHacmi, KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

    public static void main(String[] args) {
        Araba arb1=new Araba();
        arb1.setKapiSayisi(5);
        arb1.setModel(2022);
        arb1.setRenk("Kırmızı");
        arb1.setMotorHacmi(1599);
        System.out.println("arb1 = " + arb1);

        // Aşağıda yapılan atamada SETTER kullanılmadığı için
        // Araba metodundan girek kullanıyordu, bu bir hata.
        // Bu sebeple Araba metodunun içinde THIS kullanmadan
        // meton kısayollarını kullandık.
        Araba arb2=new Araba("Mavi", 2030, 1600, 4);
        System.out.println("arb2 = " + arb2);

        int arabaModeli=arb1.getModel();
        System.out.println("arabaModeli = " + arabaModeli);
/*
arb1 = Araba{renk='Kırmızı', model=2022, motorHacmi=1599.0, kapiSayisi=5}
Hatalı model girdiniz.
arb2 = Araba{renk='Mavi', model=0, motorHacmi=1600.0, kapiSayisi=4}
*/
    }
    // KURAL: genel yazılım kuralıdır.
    // Bütün değişkenler PRAVİTE yapılır.
    // Yani KAPSÜLLEME ile kullanılır.
    // Eğer gerekiyorsa private kaldırılır.
}
    /* OOP (Object Oriented Programming-
        Nesne Tabanlı Programlama /Nesne Yönelimli Programlama) için
        aşağıdaki 4 temel özelliğin gerçekleşmesi gereklidir.
    1- Abstraction(Soyutlama)
    2-İnheritance(Kalıtım)
    3-Encapsulation(Kapsülleme)
    4-Polymorphism(Çok Biçimlilik) */