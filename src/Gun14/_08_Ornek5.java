package Gun14;

import java.util.Scanner;

public class _08_Ornek5 {
    public static void main(String[] args) {

        // Girilen bir stringin harflarini teker teker
        // ekrana alt alta olacak şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Metin Giriniz= ");
        String cumle= oku.nextLine();

        for (int i=0 ; i<cumle.length() ; i++)
        {
            if (cumle.charAt(i) ==' ')
                continue;
            System.out.println(cumle.charAt(i));
        }
        /* Metin Giriniz= Merhaba Dünya
           M
           e
           r
           h
           a
           b
           a
           D
           ü
           n
           y
           a */
    }
}
