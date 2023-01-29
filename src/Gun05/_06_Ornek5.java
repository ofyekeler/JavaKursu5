package Gun05;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {
        // Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+a+a+a    alan=a*a    a=5 olsun

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir Kenarı=");
        int kenar=oku.nextInt();

        int cevre=kenar+kenar+kenar+kenar;
        int alan=kenar*kenar;

        System.out.println("Çevre = " + cevre);
        System.out.println("Alan = " + alan);

        /* Bir Kenarı=5
           Çevre = 20
           Alan = 25 */

    }
}
