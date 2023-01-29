package Gun09;

import java.util.Scanner;

public class _08_Ornek7 {
    public static void main(String[] args) {

        // Kullanıcının 2 kere gireceği şifresinin aynı olup olmadığını
        // Evet veya HAYIR olarak cevaplayınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifre giriniz= ");
        String sifre1=oku.nextLine();
        System.out.print("Şifrenizi tekrar giriniz= ");
        String sifre2= oku.nextLine();

        if (sifre1.equals(sifre2))  // string lerde equals kullan !!! (sifre1==sifre2) denmez.
                                    // çünkü bunlar "int" yani sayı değil.
            System.out.println("EVET");
        if (!sifre1.equals(sifre2))
            System.out.println("HAYIR");

        /* Şifre giriniz= elma
           Şifrenizi tekrar giriniz= elma
           EVET
           Şifre giriniz= elma
           Şifrenizi tekrar giriniz= alma
           HAYIR*/

        // 2. yöntem
        /* boolean ayniMi=sifre1.equals(sifre2);
        if (ayniMi==true)
            System.out.println("EVET");
        if (ayniMi==false)
            System.out.println("HAYIR"); */

    }
}
