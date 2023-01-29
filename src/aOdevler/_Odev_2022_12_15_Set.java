package aOdevler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _Odev_2022_12_15_Set {
    public static void main(String[] args) {

        // 1- Create a method totalCount()
            // totalCount() isminde bir method oluşturun.
            // Parametresi  'Integer Hashset' olmalı
            // HashSetteki eleman sayısını alın.
            // totalCount'u döndürün.

            // _**Örnek:**_
                //hashset ; 4,2,3,1,7
                // cevap: 5

        HashSet<Integer> hs1=new HashSet<>();
        Collections.addAll(hs1,4,2,3,1,7);
        System.out.println(totalCount(hs1));

        // 2- changeSet() isminde bir method oluşturun.
                // Parametre olarak bir String HashSet   ve  iki String
                // return hashset olmalı
                // Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.

                // **ÖRNEK:**
                    // hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
                    // String 1 = **banana**
                    // String 2 = **peach**

                    // **CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"

        HashSet<String> stringHashSet2=new HashSet<>();
        Collections.addAll(stringHashSet2,"banana","strawberry","kiwi","pineapple");
        String s21="banana",s22="peach";

        System.out.println(changeSet(stringHashSet2,s21,s22));

       // 3- commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.

                // return tipi arraylist olmalı.

            // **ÖRNEĞİN:**
                // İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
                // İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
                // Ortak değerleri ArrayListe ekleyiniz.
                // çıktı:  "Germany" , "Brazil" ,"USA"
                // ArrayListi yazdırınız.

        HashSet<String> hs31=new HashSet<>();
        Collections.addAll(hs31,"Germany","England","South Africa","Brazil","USA");

        HashSet<String> hs32=new HashSet<>();
        Collections.addAll(hs32,"Germany","China","Brazil","France","USA");

        System.out.println(commonValues(hs31,hs32));

        // 4- removing() isminde bir method oluşturun.

                // Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
                // Eğer Stringler LinkedHashset 'in içinde varsa, sil.
                // Return tipi linkedhashset

                // Örneğin,
                    // linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
                    // String 1= Germany
                    // String 2 = USA
                    // **Germany ve USA 'i sil.**
                    // Set'i döndür.

        LinkedHashSet<String> lhs4=new LinkedHashSet<>();
        Collections.addAll(lhs4,"Germany","France","USA","Canada","Mexico","Brazil");
        String s41="Germany",s42="USA";

        System.out.println(removing(lhs4,s41,s42));

        // 5- 2D ArrayList

                // Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
                // Store all the elements in one arraylist and print the arraylist
                // Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.

                // **Örnek:**

                    // ```
                    // **Girdi:**
                    // [
                    // [ 1, 2, 3 ],
                    // [ 4, 5, 6 ],
                    // [ 7, 8, 9 ]
                    // ]
                    // **Çıktı:** [1,2,3,4,5,6,7,8,9]
                    // ```

        int[][] dizi5={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> arrayList5=new ArrayList<>();

        for (int[] ints5 : dizi5) {
            for (int j5 = 0; j5 < dizi5.length; j5++)
            {
                arrayList5.add(ints5[j5]);
            }
        }
        System.out.println(arrayList5);

       // Özel Soru:

       /* 6- Bir HashSet i mainde tanımlayınız. Daha Sonra bir fonksiyonda
        random olarak toplamı 10 tane olacak şekilde 1 den 20 e kadar olan
        sayılarla doldurunuz. Set i main de yazdırınız. */

        HashSet<Integer> hs6=new HashSet<>();
        System.out.println(setFunc(hs6));
    }
/*1*/public static int totalCount(HashSet<Integer> hs1){
        return hs1.size();
    }
/*2*/public static HashSet<String> changeSet(HashSet<String> hashSet,String s21,String s22)
    {
        if (hashSet.contains(s21))
        {
            hashSet.remove(s21);
            hashSet.add(s22);
        }
        return hashSet;
    }
/*3*/public static ArrayList<String> commonValues(HashSet<String> hs31, HashSet<String> hs32)
    {
        HashSet<String> common3 = new HashSet<>(hs31);
        common3.retainAll(hs32);
        return new ArrayList<>(common3);
    }
/*4*/public static LinkedHashSet<String> removing(LinkedHashSet<String> lhs4, String s41, String s42)
    {
        if (lhs4.contains(s41))
            lhs4.remove(s41);
        if (lhs4.contains(s42))
            lhs4.remove(s42);
        return lhs4;
    }
/*6*/public static HashSet<Integer> setFunc(HashSet<Integer> hashSet6)
    {
        while (hashSet6.size()<10)
        {
            int random6=1+(int)(Math.random()*20);
            if (!hashSet6.contains(random6))
                hashSet6.add(random6);
            else{
                int random62=1+(int)(Math.random()*20);
                hashSet6.add(random62);
                }
        }
        return hashSet6;
    }
}
