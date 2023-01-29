package Gun12;

import java.util.Scanner;

public class _04_Switch_Anahtar {
    public static void main(String[] args) {

        // Kullanıcının girdiği bir günün numarasına karşılık gelen günün adını yazınız.
        // 1= pazartesi, 7= pazar gibi.

        Scanner oku=new Scanner(System.in);
        System.out.print("Gün No: ");
        int gunNo=oku.nextInt();

        // if (gunNo==1)
        //  System.out.println("Pazartesi");
             //  else
               //    if (gunNu==1)
               //    System.out.println("Salı");

        // demek yerine,

        switch (gunNo){
            case 1: System.out.println("Pazartesi"); break;
            case 2: System.out.println("Salı"); break;
            case 3: System.out.println("Çarşamba"); break;
            case 4: System.out.println("Perşembe"); break;
            case 5: System.out.println("Cuma"); break;
            case 6: System.out.println("Cumartesi"); break;
            case 7: System.out.println("Pazar"); break;
            default:System.out.println("Hatalı numara");

        // "default" un (eğer bunların dışındaysa) anlamı var.
        // eğer "break;" kullanmazsak girdiğimiz sayıdan sonrasının tamamını yazdırır.
            // mesela 4 girersek; perşembe, cuma, cumartesi, pazar; diye yazdırır.

        /* Gün No: 3
           Çarşamba */

        }
    }
}
