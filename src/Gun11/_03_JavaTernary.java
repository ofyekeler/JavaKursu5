package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı= ");
        int sayi= oku.nextInt();
// 1. yöntem
        if (sayi%2 == 0)
            System.out.println("Çift");
        else
            System.out.println("Tek");
// 2. yöntem
        String sonuc=(sayi%2==0) ? "çift" : "tek";  //  ?  -> if
                                                        // : ->  else demek.
        System.out.println("sonuc = " + sonuc);
        // aşağıdaki de "String sonuc" iç içe geçmiş yazdırma biçimi
        System.out.println((sayi%2==0)?"çift":"tek");

    }
}
