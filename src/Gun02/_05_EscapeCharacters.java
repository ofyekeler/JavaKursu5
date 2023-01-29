package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // Escape karakterler ne demek?
        // girilen karakterin komut olarak degil, gözüktüğü şekilde kullanılması gerektiğini anlatır.
        // \n -> yeni satır açıyor, alt satıra geçiyor
        // \t -> sanki tab tuşuna basılmış gibi boşluk veriyor
        // \b -> back-space bir karakter geri siler, kendisinden önceki karakteri siler.
        // \" -> çift tırnak yazmak için kullanılıyor
        // \\ -> ekrana ters slash "\" yazılacak
        // \r -> satır başına geri ve satırı silip tekrar baştan yazıyormuş gibi yapar.
                 // kendinden önceki metni siler, kendinden sonrasını yazar

        System.out.println("MerhabaDünya"); // MerhabaDünya
        System.out.println("Merhaba\nDünya"); //Merhaba alt satıra geçer Dünya
        // print veya println ters slash ı görünce bu ekrana yazılacak bir karakter değil,
        // ayrı bir iş yapmak isteniyor, devam eden "n" karakterini görünce
        // ayrı işin alt satıra geçmek olduğunu anlıyor.
        System.out.println("Merhaba\tDünya"); // Merhaba      Dünya
        System.out.println("Merhaba\bDünya"); // MerhabDünya
        System.out.println("Merhaba\"Dünya"); // Merhaba"Dünya
        System.out.println("Merhaba\\Dünya"); // Merhaba\Dünya
        System.out.println("Merhaba\rDünya"); // Dünya
    }
}
