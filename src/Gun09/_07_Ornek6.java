package Gun09;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {

        // Girilen cümledeki küçük veya büyük a harfinin olup olmadığını yazdırınız.
        // VAR veya YOK şeklinde.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle= ");
        String cumle= oku.nextLine();

        cumle=cumle.toLowerCase();  // bütün harfleri küçük yaptık.

        if (cumle.contains("a"))
            System.out.println("VAR");
        if (! cumle.contains("a"))
            System.out.println("YOK");

        /* Cümle= Havalar çok güzel.
           VAR
           Cümle= Neşeli günler geldi.
           YOK */

    }
}
