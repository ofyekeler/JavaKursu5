package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {

        // Math.Random() :  double sayı üretir. 0 - 0,999999999 arası üretiyor.

        double randomSayi=Math.random();
        System.out.println("randomSayi = " + randomSayi);

        // Örnek: 0-6 arası sayı üretsin.
        // 6 ile çarparım
        // 0 - 5,9999999 sonuçlar çıkar.
        // int'e çevirirsem 1-5 arası sayıları reastgele verir.

        int rndTamSayi= (int)(Math.random()*6); // double'ı int'e çevirerek yaptık.
                                                // çarpma işleminden sonra int'e çevirilmeli
                                                // aksi taktirde 0 gelir.

        System.out.println("rndTamSayi = " + rndTamSayi);

    }
}
