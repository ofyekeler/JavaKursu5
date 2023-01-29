package Gun03;

// ctrl+alt+l   dersen tüm yazılarını hizalar
public class _02_Degisken {
    public static void main(String[] args) {
        int sayi = 5; // tam sayi olduğunu int ile belirtiyoruz. yoksa sistem çalışmaz.

        int kisaKenar = 5;
        int uzunKenar = 7;

        int cevre;

        cevre = kisaKenar + kisaKenar + uzunKenar + uzunKenar;

        // bunu -> int cevre=kisaKenar+kisaKenar+uzunKenar+uzunKenar    diye de yazabiliriz

        System.out.println("cevresi =" +cevre);
        System.out.println("cevre =" +cevre); //  + işareti ekleme yapma anlamında

    }
}
