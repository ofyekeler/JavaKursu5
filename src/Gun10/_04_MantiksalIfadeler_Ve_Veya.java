package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler_Ve_Veya {
    public static void main(String[] args) {

        //if in içine birden fazla işarek koyabiliyoruz.
        // ve / veya ayrımını yapacağız.
        // && "ve" işaretimiz.
        // || ise "veya" işaretimizdir.

        // Girilen sayı pozitif ve tek ise, ekrana "uygun sayı girildi",
        // değilse "uygun sayı girilmedi" yazdırınız.
        // hem tek hem de pozitif -> sayi%2==1 && sayi>0 olacak.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı= ");
        int sayi= oku.nextInt();

        if (sayi%2==1 && sayi>0)
            System.out.println("uygun sayı girildi");
        else
            System.out.println("uygun sayı girilmedi");

        /* Sayı= 5
           uygun sayı girildi */

    }
}
