package Gun20;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {

        // Kullanıcının gireceği bir sayıya kadar olan (kendisi dahil) sayıların çarpımını (faktöryel)
                    // bir fonksiyonda buldurup,
        // bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        int sayi= oku.nextInt();

        int carpim=faktoryel(sayi);
        System.out.println("carpim= " + carpim);

        if ((carpim&2)==0)
            System.out.println("Çift");
        else
            System.out.println("Tek");
    }
    public static int faktoryel(int sayi){

        int carpim=1;
        for (int i = 1; i <= sayi; i++)
        {
            carpim*=i;
        }
        return carpim;
    }
/*
Sayı giriniz= 5
carpim= 120
Çift
*/
}
