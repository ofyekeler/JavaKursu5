package Gun05;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {
        // Kullanıcının Adını ve soyadını alarak ekrana yazdırınız.

        Scanner okuyucu= new Scanner(System.in);

        System.out.print("Ad ve Soyad=");

        String AdveSoyad=okuyucu.nextLine(); // Line yazarsan satırın tamamını okur.
                                             // sadece next dersem tek kelimeyi okur.

        System.out.println("AdveSoyad = " + AdveSoyad);

    /* Ad ve Soyad=Faruk YEKELER
       AdveSoyad = Faruk YEKELER */
    }
}
