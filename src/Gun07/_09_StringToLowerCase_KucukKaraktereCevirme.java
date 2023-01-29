package Gun07;

public class _09_StringToLowerCase_KucukKaraktereCevirme {
    public static void main(String[] args) {

        // toLowerCase : string i küçük harfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali text= " + text);
        System.out.println("text.toLowerCase()= " + text.toLowerCase());

        System.out.println("me ile veya ME ile başlıyor mu?= " + text.toLowerCase().startsWith("me"));
        // küçüğe çevirmeyle "me" sorgusu aynı anda yapıldı yukarıda.
        // Bunu ayrı ayrı yapmak istersek aşağıdaki gibi yapılır.

        /* orjinal hali text= Merhaba Dünya
           text.toLowerCase()= merhaba dünya
           me ile veya ME ile başlıyor mu?= true */

        String text2=text.toLowerCase();
        System.out.println("me ile başlıyor mu?= " + text2.startsWith("me"));

        /* me ile başlıyor mu?= true */

    }
}
