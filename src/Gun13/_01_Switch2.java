package Gun13;

import java.util.Scanner;

public class _01_Switch2 {
    public static void main(String[] args) {

        // Girilen bir Ay numarasına göre ayın kaç gün sürdüğünü yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("Ay No= ");
        int ayNo= oku.nextInt();

        /* 1. Yöntem, uzun olan

        switch (ayNo)
        {
        case 1: System.out.println("31 Gün"); break;
        case 2: System.out.println("28 Gün"); break;
        case 3: System.out.println("31 Gün"); break;
        case 4: System.out.println("30 Gün"); break;
        case 5: System.out.println("31 Gün"); break;
        case 6: System.out.println("30 Gün"); break;
        case 7: System.out.println("31 Gün"); break;
        case 8: System.out.println("31 Gün"); break;
        case 9: System.out.println("30 Gün"); break;
        case 10: System.out.println("31 Gün"); break;
        case 11: System.out.println("30 Gün"); break;
        case 12: System.out.println("31 Gün"); break;
        default:System.out.println("Hatalı numara");    } */

        // 2. Yöntem, kısa olan

        switch (ayNo)
        {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: System.out.println(31); break;

        case 2: System.out.println(28); break;

        case 4:
        case 6:
        case 9:
        case 11: System.out.println(30); break;

        default:System.out.println("Hatalı numara");    }

        // Günleri aynı olanları sıraya dizdim.
        // Günleri aynı olanların sonuna "break" dedim.

        /* Ay No= 13
           Hatalı numara
           Ay No= 2
           28 Gün */

    }
}
