package Gun04;

public class _03_WideninigCasting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double (genişletme/widening casting)

        int sayi=9;
        long toplam=6700;
        double oran=3.2;

        oran = sayi; // sayıyı orana attı, oran=9 , kayıp yok.

        System.out.println("oran = " + oran);

        // oran = 9.0

        toplam=sayi; // sayıyı toplama attı, bunda da kayıp yok. toplam=9

        System.out.println("toplam = " + toplam);

        // toplam = 9

        oran=toplam; // toplamı orana attık. oran=9.0 oldu, kayıp yok.
        System.out.println("oran = " + oran);

        // oran = 9.0

    }
}
