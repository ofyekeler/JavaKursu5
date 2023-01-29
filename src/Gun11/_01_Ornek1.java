package Gun11;

import java.util.Scanner;

public class _01_Ornek1 {
    public static void main(String[] args) {

        // Girilen bir sayıyı pozitif, negatif veya sıfır olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı= ");
        int sayi= oku.nextInt();
        if (sayi>0)
            System.out.println("Pozitif");
        else
        if (sayi<0)
            System.out.println("Negatif");
        else
        if (sayi==0)
            System.out.println("Sıfır");

        // "else" leri, bilgisayarı yormamak için yazdık. Yani ilk taramada elediklerini
        // ikinci taramada, üçüncü taramada tekrar tekrar taramıyor.
        // eleye eleye, sayıları azalta azalta gidiyor.

    }
}
