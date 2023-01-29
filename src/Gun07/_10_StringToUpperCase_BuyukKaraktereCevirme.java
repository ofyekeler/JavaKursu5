package Gun07;

public class _10_StringToUpperCase_BuyukKaraktereCevirme {
    public static void main(String[] args) {

        // toUpperCase : string büyük harfe çevrilir.
        
        String text="Merhaba Dünya";

        System.out.println("orijinal hali= " + text);
        System.out.println("text.toUpperCase() = " + text.toUpperCase());

        /* orijinal hali= Merhaba Dünya
           text.toUpperCase() = MERHABA DÜNYA */

        System.out.println("me veya ME ile başlıyor mu="+text.toUpperCase().startsWith("ME"));

        /* me veya ME ile başlıyor mu=true */

    }
}
