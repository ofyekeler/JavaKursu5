package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız.
        // Öğretmene "devam etmek istiyor musun (E/H)" şeklinde sorunuz.
        // ve ortalamayı geçen örenci sayısını bulunuz.

        Scanner okuInt=new Scanner(System.in); // not okumak için
        Scanner okuStr=new Scanner(System.in); // 'E'/'H' okuması için
        ArrayList<Integer>arrayNotlar=new ArrayList<>();
        int toplam=0;
        String devamMi;
                // önce not, sonra soru olduğu için do/while
        do {
            // notu girecek
            System.out.print("Not= ");
            int not=okuInt.nextInt();
            // notları Arraylist e at
            arrayNotlar.add(not);
            // girilen notları topla
            toplam+=not;
            // devam etmek istiyor musunuz (E/H)
            System.out.print("Devam etmek istiyor musunuz (E/H)= ");
            devamMi=okuStr.next();
        }while (devamMi.equalsIgnoreCase("E")); // devam edip etmek istemediğini soracağız

            // ortalamayı bul
            int ort=toplam/arrayNotlar.size();
            // geçen sayısını bul
        int gecenSayi=0;
        for (int i = 0; i < arrayNotlar.size(); i++)
        {
            if (arrayNotlar.get(i)>ort)
                gecenSayi++;
        }
        System.out.println("gecenSayi = " + gecenSayi);
/*
Not= 60
Devam etmek istiyor musunuz (E/H)= E
Not= 80
Devam etmek istiyor musunuz (E/H)= E
Not= 100
Devam etmek istiyor musunuz (E/H)= E
Not= 10
Devam etmek istiyor musunuz (E/H)= H
gecenSayi = 2
*/
    }
}
