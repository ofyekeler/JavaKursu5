package Gun06;

public class _02_StringLength_CumleUzunlugu {
    public static void main(String[] args) {
        // String, yani kelime işlemleri, çok kullanılan işlemler
        // 0 216 256 3258, stringler bölünmesi, istenilen kısmın alınması,
        // uzunluğu, **** **** *** 4566, Ismet Temut -> I.T.

        String cumle="Bugün havalar soğudu";

        int uzunluk=cumle.length();

        System.out.println("uzunluk = " + uzunluk); // böyle de yazdırılabilir.
        System.out.println("uzunluk 2= " + cumle.length()); // böyle de yazdırılabilir.

        /* uzunluk = 20
           uzunluk 2= 20 */

        // Cümlenin ne kadar uzunlukta olduğunu bize verdi.
        // Yani boşluk dahil 20 karakterden oluşuyormuş.
    }
}
