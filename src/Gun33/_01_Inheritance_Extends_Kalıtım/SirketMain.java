package Gun33._01_Inheritance_Extends_Kalıtım;

public class SirketMain {
    // Diğer class ın her özelliği ve metodlarını alıp kullanmaya
    // INHERITANCE yani KALITIM yani MİRAS denir.
    // Kalıtım / Inheritance (Extends)
    // Bir class'ın tüm özelliklerini başka bir class'ta da kullanabilmemize olanak tanır.
    // Aynı atamaları farklı class lara tekrar tekrar yazma zahmetinden bizi kurtarıyor.
    public static void main(String[] args) {
        Yonetici yonetici=new Yonetici();
        yonetici.setTcNo("34343434");

        System.out.println(yonetici);
    }
}
