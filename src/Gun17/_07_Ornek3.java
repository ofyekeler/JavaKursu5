package Gun17;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class _07_Ornek3 {
    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random(10 dahil) olarak doldurduktan sonra,
        // kullanıcının gireceği bir rakamı arattırınız
        // bu rakam var ise index ini yazdırınız.

        int[] dizi=new int [10];

        for (int i = 0; i < dizi.length; i++) // 10 elemanlı bir diziyi random(10 dahil) olarak doldurduk.
        {
            dizi [i]=(int)(Math.random()*11);
        }
        Arrays.sort(dizi);  // küçükten büyüğe sıraladım
        System.out.println(Arrays.toString(dizi));  // String de ki index karşılığındaki rakamları yazdırdım.

        Scanner oku = new Scanner(System.in);
        System.out.print("Aranacak Sayı (0-10)= ");
        int arananRakam=oku.nextInt(); // kullanıcının gireceği bir rakam.

        for (int i = 0; i < dizi.length; i++)
        {
            if (dizi[i] == arananRakam)
                System.out.println("Var, Oda Numarası= "+i+". indexte");
        }
        /*
[7, 7, 0, 1, 3, 4, 8, 3, 7, 4]
Aranacak Sayı (0-10)= 4
Var, Oda Numarası= 5. indexte
Var, Oda Numarası= 9. indexte
        */
    }
}
