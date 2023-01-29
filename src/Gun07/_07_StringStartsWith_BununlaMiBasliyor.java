package Gun07;

public class _07_StringStartsWith_BununlaMiBasliyor {
    public static void main(String[] args) {

        // StartWith : bununla başlıyor mu?
        // sonuç= true / false
        // büyük/küçük harf duyarlı.

        String text="HCL Teknoloji";

        System.out.println("text.startsWith(\"HC\") = " + text.startsWith("HC"));
        System.out.println("text.startsWith(\"te\") = " + text.startsWith("te"));
        System.out.println("text.startsWith(\"h\") = " + text.startsWith("h"));

        /* text.startsWith("HC") = true
           text.startsWith("te") = false
           text.startsWith("h") = false */

    }
}
