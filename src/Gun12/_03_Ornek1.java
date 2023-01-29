package Gun12;

import java.util.Scanner;

public class _03_Ornek1 {
    public static void main(String[] args) {

        // Kullanıcıdan "Fizik:90" şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        //  < 40 için F yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Ders ve notunu giriniz= ");
        String dersVeNot= oku.nextLine();

        int index=dersVeNot.indexOf(":");
        int ogrNot=Integer.parseInt(dersVeNot.substring(index+1));
        // 2. ayırma yöntemi:
        // int ogrNot=Integer.parseInt(dersVeNot.replaceAll("[^0-9]",""));

        if (ogrNot>=90)
            System.out.println("A");
        else
            if (ogrNot>=80)
                System.out.println("B");
            else
                if (ogrNot>=70)
                    System.out.println("C");
                else
                    if (ogrNot>=60)
                        System.out.println("D");
                    else
                        if (ogrNot>=40)
                            System.out.println("E");
                        else
                            System.out.println("F");

        /* Ders ve notunu giriniz= Fizik:39
           F */

    }
}
