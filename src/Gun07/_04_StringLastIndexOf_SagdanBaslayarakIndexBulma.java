package Gun07;

public class _04_StringLastIndexOf_SagdanBaslayarakIndexBulma {
    public static void main(String[] args) {

        // indexOf gibi çalışır.
        // Ama   lastIndexOf   aramaya SONDAN başlar.
        // oda numaralarının sırası değişmez!!! sadece arama yönününü değiştirir.
        // yani, index her zaman tektir. Sadece arama yönü değişir.

        String s1 = "Merhaba";

        System.out.println("s1.indexOf(\"a\") = " + s1.indexOf("a")); // 4
        System.out.println("s1.lastIndexOf(\"a\") = " + s1.lastIndexOf("a")); // 6
        
        /* s1.indexOf("a") = 4
           s1.lastIndexOf("a") = 6 */

        // 2. yöntem

        int sayi = s1.lastIndexOf("a");
        System.out.println("sayi = " + sayi);

        /* sayi = 6 */

    }
}
