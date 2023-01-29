package Gun06;

public class _03_StringCharAt_SayiVererekKarakterBulma {
    public static void main(String[] args) {
        // istenilen noktadaki karakteri verir.
        // karaktterlerin sırası 0(sıfır)'dan başlar ve buna index denir.

        String cumle="Merhaba Dünya";
        //            0123456789 10 11 12   gibi.
        // length i 13 ama karakterlerin odası 0-12 arası.

        char ilkHarf=cumle.charAt(0);  // ilk karakteri alıyorum.

        System.out.println("ilkHarf = " + ilkHarf);

        /* ilkHarf = M */

    }
}
