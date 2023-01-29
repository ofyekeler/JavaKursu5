package Gun05;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve Soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("adınız=");

        String Ad=oku.next(); //  nextLine yazmamıza gerek yok, çünkü tek kelime olacak.

        System.out.println("Ad = " + Ad);

        System.out.print("soyadınız=");

        String Soyad=oku.next();

        System.out.println("Soyad = " + Soyad); // soutv'de 4 ve 7. satırdaki birleştirip
                                                // ("Adınız ve soyadınız="+Ad+" "+Soyad); da yazabiliriz.

        /* adınız=Faruk
           Ad = Faruk
           soyadınız=Yekeler
           Soyad = Yekeler */

    }
}
