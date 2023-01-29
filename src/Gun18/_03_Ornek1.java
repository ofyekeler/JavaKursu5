package Gun18;

import java.util.Arrays;

public class _03_Ornek1 {
    public static void main(String[] args) {

        // 2 ile 3 lük tabloyu random 100 e kadar sayılarla doldurunuz.
        // bütün doldurma işlemi bittikten sonra yazdırınız.
        // ve kaç tane tek sayı olduğunu bulunuz.

        int[][] tablo=new int [2][3];
        int tekMiktar=0;

        for (int i = 0; i < 2 ; i++) // random 100 e kadar sayılarla doldurduk.
        {
            for (int j = 0; j < 3; j++)
            {
                tablo[i][j]=(int)(Math.random()*100);
            }
        }
// aşağıdaki 2. for döngüsünü yukarıya yedirebiliriz. Anlaşılabilir olsun diye ayrı yazıyoruz.
// önce random yapıp sonra tek sayıl bulduk.

        for (int i = 0; i < 2 ; i++) // random 100 e kadar sayılarla doldurduk.
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(tablo[i][j]+" ");
                if (tablo[i][j] % 2 ==1)
                    tekMiktar++;
            }
            System.out.println();
        }
        System.out.println("tekMiktar = " + tekMiktar);
/*
62 51 38
59 25 64
tekMiktar = 3
*/
    }
}
