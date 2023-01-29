package Gun10;

import java.util.Scanner;

public class _01_IfElse_OyleyseBu_DegilseSu {
    public static void main(String[] args) {

        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise "geçtiniz"
        // küçük ise "kaldınız" yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Notu Giriniz= ");
        int ogrNot= oku.nextInt();

        // 1. Yöntem;
        if (ogrNot>=50)
            System.out.println("Geçtiniz");
        if (ogrNot<50)
            System.out.println("Kaldınız");

        // 2. Yöntem
        if (ogrNot>=50)
        {   System.out.println("Geçtiniz");
            System.out.println("Tebrikler"); } // birden fazla komut tercih ettiğimiz için
                                               //  {} parantezini kullandık.
        else                               // "değilse" anlamı var.
            System.out.println("Kaldınız");


    }
}
