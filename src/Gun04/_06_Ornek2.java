package Gun04;

import java.text.DecimalFormat;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değer veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazdırınız.
        // vücut kitle endeksini de bularak yazdırınız (kg/(boy*boy))

        int kilonuz=75;
        Double boyunuz=1.65;

        System.out.println("boyunuz="+boyunuz+" ve "+"kilonuz="+kilonuz);

        Double vucutKitleEndeksi;
        vucutKitleEndeksi=kilonuz/(boyunuz*boyunuz);

        System.out.println("vucutKitleEndeksi = " + vucutKitleEndeksi);

        /* boyunuz=1.65 ve kilonuz=75
           vucutKitleEndeksi = 27.548209366391188 */
    }
}
