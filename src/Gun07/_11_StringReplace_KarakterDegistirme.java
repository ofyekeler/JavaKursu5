package Gun07;

public class _11_StringReplace_KarakterDegistirme {
    public static void main(String[] args) {

        // replace : bir string içindeki karakter(ler)i verilenle değiştirir.

        String text = "Merhaba Dünya";

        System.out.println("text = " + text);
        System.out.println("text.replace(\"a\",\"e\") = " + text.replace("a", "e"));
        System.out.println("text.replace(\"ba\",\"de\") = " + text.replace("ba", "de"));
        System.out.println("text.replace(\"Dünya\", \"Java\") = " + text.replace("Dünya", "Java"));
        System.out.println("text.replace(\"a\",\"\") = " + text.replace("a", ""));

        /* text = Merhaba Dünya
           text.replace("a","e") = Merhebe Dünye
           text.replace("ba","de") = Merhade Dünya
           text.replace("Dünya", "Java") = Merhaba Java
           text.replace("a","") = Merhb Düny             */

    }
}
