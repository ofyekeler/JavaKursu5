package Gun25;

// Class - Tiplerin tanımlandığı yer

public class _01_JavaClassAndObject {

    // Metodların yazıldığı yer

    public static void main(String[] args) {

        // Ana programın başladığı ve çalıştığı yer

        Araba benimArabam=new Araba(); // Araba-tür, tip-adı, benimArabam-nesne
        benimArabam.marka="BMW";
        benimArabam.renk="beyaz";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2000;

        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
    } // Dur.

    // Metodların yazıldığı yer

}
// Class - Tiplerin tanımlandığı yer

class Araba {
    // PROPERTIES, FIELD, ÖZELLİK bölümü.
    String renk;
    int yili;
    String marka;
    int motorHacmi;}
