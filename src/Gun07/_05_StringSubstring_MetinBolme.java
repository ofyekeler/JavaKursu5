package Gun07;

public class _05_StringSubstring_MetinBolme {
    public static void main(String[] args) {

        // string in belli bir bölümünü alma işlemi yapar.

        String s1="Merhaba Arkadaşlar";
                 //0123456 8901234567
        String parca1= s1.substring(3,9);
        System.out.println("parca1 = " + parca1);

        /* parca1 = haba A */

        // sonuncu rakamı almıyor !!! "x<= a <y" gibi.

        String parca2= s1.substring(8,15);
        System.out.println("parca2 = " + parca2);

        /* parca2 = Arkadaş */

        String parca3= s1.substring(8); // 8 den sonrasının tamamını alır.
        System.out.println("parca3 = " + parca3);

        /* parca3 = Arkadaşlar */

    }
}
