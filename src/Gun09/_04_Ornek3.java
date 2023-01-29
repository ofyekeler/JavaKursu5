package Gun09;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {

        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı= ");
        int sayi= oku.nextInt();

        if (sayi%2 != 0)  // kalan 0 değilse tektir.
            System.out.println("Sayı tektir");
        if (sayi%2 ==0)
            System.out.println("Sayı çifttir");

        /* Sayı= 6
           Sayı çifttir */
        /* Sayı= 3
           Sayı tektir */

    }
}
