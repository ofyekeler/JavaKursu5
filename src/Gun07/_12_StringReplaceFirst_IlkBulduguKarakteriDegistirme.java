package Gun07;

public class _12_StringReplaceFirst_IlkBulduguKarakteriDegistirme {
    public static void main(String[] args) {

        // replaceFirst : bir string içindeki karakter(ler)i verilenle değiştirir.
        // Sadece soldan ilk bulduğunu değiştirir. Sonrasında da aynı karakter(ler) varsa onları DEĞİŞTİRMEZ!!!

        String text="Merhaba Dünya";

        System.out.println("text = " + text);
        System.out.println("text.replaceFirst(a,e) = " + text.replaceFirst("a","e"));
        System.out.println("text.replaceFirst(ba,de) = " + text.replaceFirst("ba","de"));
        System.out.println("text.replaceFirst(Dünya,Java) = " + text.replaceFirst("Dünya","Java"));
        System.out.println("text.replaceFirst(a, ) = " + text.replaceFirst("a",""));


        /* text = Merhaba Dünya
           text.replaceFirst(a,e) = Merheba Dünya
           text.replaceFirst(ba,de) = Merhade Dünya
           text.replaceFirst(Dünya,Java) = Merhaba Java
           text.replaceFirst(a, ) = Merhba Dünya */
    }
}
