package Gun06;

public class _08_StringContains_KarakterVarligiKontrolu {
    public static void main(String[] args) {
         // contains: bir string in içerisinde karakter(lerin) var olup olmadığını
         // boolean cinsinden söyle, true veya false.

        String cumle="Merhaba Dünya";

        boolean varMi= cumle.contains("a");
        System.out.println("varMi = " + varMi);

        /* varMi = true */

        // aşağıdaki gibi "boolean" sız direk de yazılabilir.
        // yani String ten sonra direk soutv yazıp aşağıdaki gibi de yazılabilir.

        System.out.println("varMi= " + cumle.contains("a"));

        /* varMi = true */

        System.out.println("varMi= " + cumle.contains("k"));

        /* varMi= false */

    }
}
