package Gun07;

public class _13_StringReplaceAll_CokluKarakterDegistirme {
    public static void main(String[] args) {

        // ReplaceAll : replace gibi çalışır. Farkı, kriter (regex) verilebiliyor.
        // regex : regular expression / düzenli ifadeler

        String text="Merhaba Dünya123";

        System.out.println("text = " + text);
        System.out.println("abn -> _ = " + text.replaceAll("[abn]","_"));

        /* text = Merhaba Dünya123
           abn -> _ = Merh___ Dü_y_123    */

        System.out.println("text.replaceAll() = " + text.replaceAll("[A-Z]","_"));
        System.out.println("text.replaceAll(\"[0-9]\",\"\") = " + text.replaceAll("[0-9]",""));
        System.out.println("0-9 dışındakile -> _  = " + text.replaceAll("[^0-9]",""));
                    // ^  dışındakiler, anlamı katar.

        /* text.replaceAll() = _erhaba _ünya123
           text.replaceAll("[0-9]","") = Merhaba Dünya
           0-9 dışındakile -> _  = 123 */

        System.out.println("a-z+ü= " + text.replaceAll("[a-z+ü+ ]","_"));

        /* a-z+ü= M______D____123 */

    }
}
