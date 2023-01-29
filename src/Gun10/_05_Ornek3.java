package Gun10;

import java.util.Scanner;

public class _05_Ornek3 {
    public static void main(String[] args) {

        // Girilen bir string in uzunluğu 10  dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana "evet" yazdırınız.
        // değilse "hayır" yazdırınız.
        // (metni küçülterek kontrol ediniz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Text= ");
        String text= oku.nextLine();

        if (text.length()>10 && text.toLowerCase().contains("study")==true)
            // contains kodu boolean a dayanır ve cevabı true-false tur.
            System.out.println("Evet");
        else
            System.out.println("Hayır");

        /* Text= Techno Study
           Evet */

    }
}
