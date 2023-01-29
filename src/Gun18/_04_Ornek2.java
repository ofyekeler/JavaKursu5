package Gun18;

import java.util.Scanner;

public class _04_Ornek2 {
    public static void main(String[] args) {

        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı olarak doldurunuz.
        // daha sonra ayrı bir döngüde en büyük sayıyı bulunuz.

        Scanner oku=new Scanner(System.in);
        int[][] tablo=new int [2][3];

        // 1. "for" da okuma yapıyoruz

        for (int i = 0; i < 2 ; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print("Sayı Giriniz= ");
                tablo[i][j]= oku.nextInt();
            }
        }

        // 2. "for" da yazma işlemi

        for (int i = 0; i < 2 ; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(tablo[i][j]+" ");
            }
            System.out.println();
        }

        // 3. "for" da en büyük sayıyı bulma işlemi

        int enBuyukSayi=tablo[0][0];
        for (int i = 0; i < 2 ; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (tablo[i][j] > enBuyukSayi)
                    enBuyukSayi=tablo[i][j];
            }
        }
        System.out.println("enBuyukSayi = " + enBuyukSayi);
    }
}
