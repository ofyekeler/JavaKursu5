package Gun07;

public class _08_StringEndsWith_BununlaMiBitiyor {
    public static void main(String[] args) {

        // EndsWith: verilen karakter(ler) ile bitiyor mu?
        // sonuç true / false yani boolean döner.

        String text="Merhaba Dünya";

        System.out.println("text.endsWith(ya) = " + text.endsWith("ya"));
        System.out.println("text.endsWith(n) = " + text.endsWith("n"));
        System.out.println("text.endsWith(A) = " + text.endsWith("A"));
        System.out.println("text.endsWith(Dünya) = " + text.endsWith("Dünya"));

        /* text.endsWith(ya) = true
           text.endsWith(n) = false
           text.endsWith(A) = false
           text.endsWith(Dünya) = true */

    }
}
