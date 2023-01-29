package Gun23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Ornek1 {
    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random (10 dahil) a kadar olan sayılarla doldurduktan sonra,
        // tekrarlı değerleri almayacak şekilde yeni bir diziye atınız.

        Integer[]dizi=new Integer[10];
        for (int i = 0; i < dizi.length; i++)
        {
            dizi[i]=(int)(Math.random()*11); // 10 dahil dediği için 11 yazdım.
        }
        System.out.println("dizi = " + Arrays.toString(dizi));

        // 1. yöntem
        HashSet<Integer> hs1=new HashSet<>();

        for (int i = 0; i < dizi.length; i++)
        {
            hs1.add(dizi[i]);
        }
        System.out.println("hs1= " + hs1);

        // 2. yöntem
        HashSet<Integer>hs2=new HashSet<>(Arrays.asList(dizi));
        System.out.println("hs2= " + hs2);

        // 3. yöntem
        HashSet<Integer>hs3=new HashSet<>();
        Collections.addAll(hs3,dizi);
        System.out.println("hs3= " + hs3);
/*
dizi = [9, 7, 6, 1, 2, 2, 2, 10, 9, 10]
hs1= [1, 2, 6, 7, 9, 10]
hs2= [1, 2, 6, 7, 9, 10]
hs3= [1, 2, 6, 7, 9, 10]
*/
    }
}
