package Gun07;

public class _03_StringIsEmpty_StringBosMu {
    public static void main(String[] args) {

        // isEmpty: bir stringin içinde bir şey var mı yok mu bollean olarak verir.

        String s1 = "Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty()); // false

        String s2 = " "; // boşluk da bir karakterdir. A gibi.
        System.out.println("s2.isEmpty() = " + s2.isEmpty()); // false

        String s3 = ""; //hiçbir şey yok, yani boş, empty.
        System.out.println("s3.isEmpty() = " + s3.isEmpty());
         /* s1.isEmpty() = false
            s2.isEmpty() = false
            s3.isEmpty() = true */

        // 2. yöntem
        String s4 = ""; //hiçbir şey yok, yani boş, empty.
        Boolean bosMu = s4.isEmpty();

        System.out.println("bosMu = " + bosMu);

        /* bosMu = true */

    }
}
