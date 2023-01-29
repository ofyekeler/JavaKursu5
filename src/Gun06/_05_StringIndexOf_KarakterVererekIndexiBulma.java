package Gun06;

public class _05_StringIndexOf_KarakterVererekIndexiBulma {
    public static void main(String[] args) {
        // 01234 : harflerin ada numaraları 0 dan başlar : index.
        // Bugün

        String cumle="Merhaba Dünya";
        // D nin index i kaçtır? - 8'dir.
        // M nin index i kaçtır? - 0'dır.
        // 0(506)3445567 -> "(" in oda numarası (index i) kaç? - 1'dir.
            // Verilen karakter(ler)in string içindeki INDEX ini verir.

        // scanner ile ekrana yazdırmada kullanırsak, [int ,,,=---.indexOf("D")];

        System.out.println("cumle.indexOf(D) = " + cumle.indexOf("D"));
        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M"));
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha"));
        System.out.println("cumle.indexOf() = " + cumle.indexOf(" "));
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); // bu harf yok, java nasıl cevap verecek? "-1" yok demek.
        System.out.println("cumle.indexOf(\"a\", 5) = " + cumle.indexOf("a", 5));
                                            // ("a", 5) yazdığında küçük yazıları (str., fromIndex'i kendisi koyuyor.
                                            // 5'inci karakterden sonraki "a" yı bul komutu verdik.
        
        /* cumle.indexOf(D) = 8
           cumle.indexOf(M) = 0
           cumle.indexOf(ha) = 3
           cumle.indexOf() = 7
           cumle.indexOf(A) = -1 */





    }
}
