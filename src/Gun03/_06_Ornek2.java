package Gun03;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Ornek Soru: yarıçapı (r) verilen bir dairenin çevresini ve alanını bulunuz.
        // alan= pi*r*r   cevre= 2*pi*r    pi= 3.14   r= 4.5

        double pi= 3.14;
        double yaricapi= 4.5;

        double alan= pi*yaricapi*yaricapi;
        double cevre= pi*yaricapi*2;

        System.out.println("alanı = " + alan); // + (artı) nın yan yana yazma amacı var
        System.out.println("cevresi = " + cevre); // toplama anlamı yok !!!

        // alanı = 63.585
        // cevresi = 28.26
    }
}
