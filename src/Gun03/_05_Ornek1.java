package Gun03;

public class _05_Ornek1 {
    public static void main(String[] args) {
        // iki kenarlı tanımlı olarak verilen bir dikdörtgenin çevresini ve alanını bulunuz.
        // çarpma: * kullanılıyor, x ise harf olarak kullanılıyor.
        // bir kenarı 5 ise, diğer kenarı 7 ise, cevre=5+5+7+7, alan=5*7

        int aKenari= 5;
        int bKenari= 7;

        int cevre= aKenari+aKenari+bKenari+bKenari;
        int alan= aKenari*bKenari;

        System.out.println("cevresi = " + cevre);
        System.out.println("alanı = " + alan);

        // cevresi = 24
        // alanı = 35

    }
}
