package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;

        sayi=(int)oran; // tehlikeli işlem yapıyorsun, bundan dolayı challenger patladı.
        // değerine bak, eğer oluşacak veri kaybını anladıysan ve kabul ettiysen
        // bana bunu bilerek yaptığını göster. Göstermeyi (int) olarak belirtiyoruz.
        // daraltma (narrowing casting)

        System.out.println("sayi = " + sayi);

        // sayi = 3 // 3.2 nin 2'si kayboldu. // Narrowing Casting

        /* ****************************************************** */
        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre = (byte)(kisaKenar+uzunKenar+kisaKenar+uzunKenar); // tek başına bir rakam gördüğünde
                                                                     // toplanacak sayıları gördüğünde
                                                                     // işlem sonucunu gördüğünde
                                                                    // int muamelesi çekiyor.
        // sen eşitliğin 2. tarafı rakamlar toplandı, benim toplam burada INT durumunda.
        // byte cevre = 5+7+5+7; // int i -> byte atamaya çalışıyorsun.
        // bana bunu yazarak göster. (byte)(kisaKe.......) şeklinde.

        System.out.println("cevre = " + cevre);

        /* yukarıdaki "byte cevre=" olan işlem, aşağıdaki gibi
        direk "int cevre" yazılarak int e çevrilerek yazdırılabilir */

        int cevre2=kisaKenar+uzunKenar+kisaKenar+uzunKenar;
        System.out.println("cevre2 = " + cevre2);

    }
}
