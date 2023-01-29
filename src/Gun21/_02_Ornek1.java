package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye (ArrayList) atayarak yazdırınız.


        // Kullanıcıdan 6 elemanlı bir dizi oluştur
        Scanner oku=new Scanner(System.in);
        int [] dizi=new int[6];
        
        for (int i = 0; i < dizi.length; i++)
        {
            System.out.print("Sayı= ");
            dizi[i]= oku.nextInt();
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        // sadece tek sayı olan elemanlarını ayrı diziye (ArrayList) atayarak yazdıralım
        ArrayList<Integer> tekler=new ArrayList<>();

        for (int i = 0; i < dizi.length; i++)
        {
            if(dizi[i]%2!=0)
                tekler.add(dizi[i]);
        }
        System.out.println("tekler = " + tekler);

/*
Sayı= 1
Sayı= 3
Sayı= 4
Sayı= 6
Sayı= 9
Sayı= 11
Arrays.toString(dizi) = [1, 3, 4, 6, 9, 11]
tekler = [1, 3, 9, 11]
*/

    }
}
