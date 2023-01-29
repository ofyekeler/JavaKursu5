package aOdevler;

import java.util.Arrays;
import java.util.Scanner;

public class _Odev_2022_12_01_ {
    public static void main(String[] args) {

        //1 Bu String'i oluşturun. "Removes white space from both ends of a string"
             //String'deki kelime sayısını yazdırınız.

        String cumle1="Removes white space from both ends of a string";

        int boslukSayisi1=0;
        for (int i1 = 0; i1 < cumle1.length(); i1++)
        {
            if (cumle1.charAt(i1)==' ')
                boslukSayisi1++;
        }
        System.out.println("1) Kelime Sayısı= " + (boslukSayisi1+1));

        // 2- Bir String oluşturun : "Hello World"
           //Stringi tersten yazdırın ve print edin.
           //_Cevap böyle olmalı :  "dlroW olleH"_

        String cumle2="Hello World";

        for(int i2=cumle2.length()-1;i2>=0;i2--)
        {
            System.out.print(cumle2.charAt(i2));
        }

        //3 -İnt Array oluştur ve elemanları   : 25,30,30,35,100
           //Array in elemanlarının toplamını yazdır.
           //Cevap 220 olmalı.

        int []dizi3={25,30,30,35,100};
        int toplam3=0;
        for (int i3 = 0; i3 < dizi3.length; i3++)
        {
            toplam3+=dizi3[i3];
        }
        System.out.println();
        System.out.println("3) toplam3 = " + toplam3);

        //4- int Array oluşturun.
           //elemanları : 13, 15,14,16,16
           //Arrayin elemanlarını yazdırın.

        int []dizi4={13,15,14,16,16};
        for (int i4 = 0; i4 < dizi4.length; i4++)
        {
            System.out.print(dizi4[i4]+" ");
        }

        //5- String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
           //Array'daki eleman sayısını yazdırınız.
           //Cevap 4 olmalı.
        
        String[]dizi5={"new jersey", "new york", "boston", "california"};
        System.out.println();
        System.out.println("5) dizi5.length = " + dizi5.length);

        //6- String Array (Dizi) oluşturunuz.
           // elemanları : Apple, Orange , Babana, Kiwi
           //Array'leri tüm elemanları yazdırınız.

        String[]dizi6={"Apple", "Orange", "Babana", "Kiwi"};
        for (int i6 = 0; i6 < dizi6.length; i6++)
        {
            System.out.print(dizi6[i6]+" ");
        }

        //7- int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
           //Array'in ortalamasını alınız.

        int []dizi7={12,14,21,23,10,4};
        int toplam7=0;
        int ort7;
        for (int i7 = 0; i7 < dizi7.length; i7++)
        {
            toplam7+=dizi7[i7];
        }
        ort7=toplam7/ dizi7.length;
        System.out.println();
        System.out.println("7) ort7 = " + ort7);

        //8- int Array oluşturun ve elemanları : 5,6,8,12,14,19
          //Eğer sayı çiftse topla, tekse çıkar.
          //**Örneğin:**
          // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
          //Toplamlarını yazdırın.

        int []dizi8={5,6,8,12,14,19};
        int toplam8=0;
        for (int i8 = 0; i8 < dizi8.length; i8++)
        {
            if (dizi8[i8]%2==0)
            {
                toplam8+=dizi8[i8];
            }
            else
            {
                toplam8-=dizi8[i8];
            }
        }
        System.out.println("8) Sonuç= " + toplam8);

        //9- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
           //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[]dizi9={15 , 25, 22, 18, 30};
        int max91=0;
        int max92=0;

        for (int i9 = 0; i9 < dizi9.length; i9++)
        {
            if (dizi9[i9]>max91)
            {
                max92=max91; // max91 daha büyüğünü buldukça eski değerini 92ye devrediyor.
                max91=dizi9[i9];
                //
            }
            else if (dizi9[i9]>max92)
            {
                max92=dizi9[i9];
            }
        }
        System.out.println("9) 1. Büyük Sayı= " + max91);
        System.out.println("9) 2. Büyük Sayı= " + max92);

        // 2.Yöntem
        Arrays.sort(dizi9);
        System.out.println("9) 2. Büyük Sayı= " + dizi9[dizi9.length-2]);


        // 10- int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
           //En küçük (minimum) sayıyı yazdırınız.

        int[]dizi10={14,19,5,21};
        int min10=dizi10[0]; // aldığı sayı 0 ıncı indexteki 14, diğer indexlerde yazılabilir
                             // sonuç değişmez.
        for (int i10 = 0; i10 < dizi10.length; i10++)
        {
            if (dizi10[i10]<min10)  //  14 ten küçükleri alıp eşitleyerek en küçüğü bulacak
            {
                min10=dizi10[i10];
            }
        }
        System.out.println("10) min10= " + min10);

        // 2. Yöntem
        Arrays.sort(dizi10);
        System.out.println("10) min10= " + dizi10[0]);


        // 11- int Array oluşturun ve elemanları : 12,2,5,15,8
          //En büyük değeri yazdırınız.

        int[]dizi11={12,2,5,15,8};
        int max11=dizi11[0];
        for (int i11 = 0; i11 < dizi10.length; i11++)
        {
            if (dizi11[i11]>max11)
            {
                max11=dizi11[i11];
            }
        }
        System.out.println("11) max11= " + max11);

        // 2. Yöntem
        Arrays.sort(dizi11);
        System.out.println("11) max11= " + dizi11[dizi11.length-1]);

        //12- String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
            //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
            //Eğer aitse "true" çevirin.
            //Loops (döngüler) kullanın.

        String[]dizi12={"Apple", "Orange", "Banana", "Pineapple"};
        for (int i12 = 0; i12 < dizi12.length; i12++)
        {
            if (dizi12[i12].equals("Apple"))
            {
                System.out.println("12) "+true);
            }
            if (dizi12[i12].equals("General"))
            {
                System.out.println("12) "+true);
            }else System.out.println("12) "+false);break;
        }

        //13- Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
          //$ işaretlerini kaldırın ve sayıları toplayın.
          //Sayıların toplamını yazdırın.

        String metin13="$12 $23 $10 $2 $5 $2";
        String[]dizi13=metin13.split(" "); // boşuklar aracılığıyla böler ve diziye atar
        int toplam13=0;
        for (int i13 = 0; i13 < dizi13.length; i13++)
        {
            dizi13[i13]=dizi13[i13].replace("$","");
            toplam13+=Integer.parseInt(dizi13[i13]);
        }
        System.out.println("13) toplam13 = " + toplam13);
    }
}
