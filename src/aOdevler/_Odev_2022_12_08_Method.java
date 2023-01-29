package aOdevler;

import java.util.Arrays;
import java.util.Scanner;

public class _Odev_2022_12_08_Method {
    public static void main(String[] args) {

        // 1- Ismi **randomNum** olan bir method oluşturun.
            //Parametre olarak **int max** almalı.
            //Bu method, 0 ile max arasında random bir değer döndürmelidir.
            // Random numarayı döndürünüz.

        System.out.println(randomNum1(12));





        //2- "OrtaKelime" isminden bir method oluşturun.
            //Bu method String'i parametre olarak almalı.
            //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
            //Ortadaki kelimeyi return yapınız.
            //Örnek: Ben Java'yı seviyorum.
            //print : Java'yı
            //Örnek2:
            //Java'yı kolayca öğreniyorum.
            //print: kolayca

        Scanner oku2 =new Scanner(System.in);
        System.out.print("Cümle giriniz : ");
        String cumle2 = oku2.nextLine();

        System.out.println(ortaKelime2(cumle2));

        // 3- reverseString isminde bir method oluşturun.
            //Bu method bir String'i parametre olarak alsın.
            //Ve bu method, girilen String'i tersten yazsın.
            //Terste yazılmış halini yazdırınız.
            //Örn: String = "Java'yı Seviyorum."
            //Print: .muroyiveS ıy'avaJ

        String strCumle3="Faruk YEKELER";
        reverseString(strCumle3);
        System.out.println();

        // 4- adı  reverseWord olan bir method oluşturun
            //Bu methodun String olarak bir parametresi olmalıdır
            //Ve bu cümledeki kelimelerle tersine çevirmeli
            //Ters halini yazdırın.
            //Örnek 1 :
            //Dize: Java yazın
            //dönüş şöyle olmalıdır:  yazın Java

        String cumle4="Ömer Faruk YEKELER";
        reverseWorld(cumle4);

        //5- EvenOddNums isminde bir method oluşturun.
            //Bu yöntem String olan bir parametreyi kabul etsin.
            //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
            //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
            //toplam sonucu yazdırın.
            //**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
            //For example Örnek:
            //String =  "6678421312"
            //6+6-7+8+4+2-1-3-1+2
            //sonuç 16 olmalı

        String sayi5 = "4444433333";
        EvennOddNumber(sayi5);

        //6- Girilen bir diziyi tersten yazdıran bir metod yazınız.

        String[] dizi6={"f","a","r","u","k"};
        reverseArr(dizi6);

        //7- powerOfThree isminde bir method oluşturun.
            //Parametre olarak int
            //Return tipi boolean
            //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
            //**Örnek 1:**
            //```
            //**Girdi:** 27
            //**Çıktı:** true
            //```

            //```
            //Açıklama: 3*3*3 =27
            //```

            //```
            //Sonuç= true
            //```

        System.out.println(powerOfThree((sayiOku7())));

        //8- `append adında bir method oluşturun.`
            //`Parametre olarak iki int array  oluşturun.`
            // ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
            // Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
            //Bunu döndürmelidir:
            // {2, 4, 6, 1, 2, 3, 4, 5}.

        int[] dizi81={1,2,3};
        int[] dizi82={4,5,6,7,8};
        System.out.println(Arrays.toString(append(dizi81,dizi82)));

        //9- isUnique adında bir method oluşturun.
             //Parametre olarak int array alır.
             // ve bu dizideki değerlerin benzersiz olup olmadığını gösteren
             // bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
             //örneğin, list isminde bir array'imiz varsa,
             //```
            //int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
            //```
            //Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
            //```
            //int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
            //```
            //Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.

        int[] list91 = {8, 8, 12, 2, 9, 17, 43, -8, 46, 203, 43};
        int[] list92 = {2, 7, 2, 3, 9, 12, -47, -19, 308, 3, 66};

        System.out.println(isUnique(list91));
        System.out.println(isUnique(list92));

    }
/*1*/public static int randomNum1(int max1){

        return (int) (Math.random()*max1);
    }
/*2*/public static String ortaKelime2(String cumle2){
        int ilkBosluk2=cumle2.indexOf(" ");
        int sonBosluk2=cumle2.lastIndexOf(" ");

        return cumle2.substring(ilkBosluk2+1,sonBosluk2);
    }
/*3*/public static void reverseString(String cumle3){
        for (int i3 = cumle3.length()-1; i3 >=0 ; i3--)
        {
            System.out.print(cumle3.charAt(i3));
        }
    }
/*4*/public static void reverseWorld(String cumle){
        String[] dizi4=cumle.split(" ");
        for (int i4 = dizi4.length-1; i4 >=0 ; i4--)
        {
            if (i4!=0)
                System.out.print(dizi4[i4]+" ");
            else
                System.out.println(dizi4[i4]);
        }
    }
/*5*/public static void EvennOddNumber(String strSayi5){
        int intSayi5= Integer.parseInt(strSayi5);
        int toplam5=0;
        do {
            if((intSayi5%10)%2==0)
                toplam5+=intSayi5%10;
            else
                toplam5-=intSayi5%10;
            intSayi5=intSayi5/10;  // sayının birler basamağını siliyor.
        }while (intSayi5>0);
        System.out.println(toplam5);
    }
/*6*/public static void reverseArr(String[] dizi6)
    {
        for (int i6 = dizi6.length-1; i6 >=0 ; i6--) {
            System.out.print(dizi6[i6]);
        }
    }

/*7*/public static boolean powerOfThree(int sayi7){
        for (int i7 = 3; i7 <=sayi7 ; i7*=3)
        {
            if (i7==sayi7)
                return true;
        }
        return false;
    }
/*7*/public static int sayiOku7(){
        Scanner oku7=new Scanner(System.in);
        System.out.print("Sayi giriniz= ");
        return oku7.nextInt();
    }

/*8*/public static int[] append(int[] dizi81, int[] dizi82){
        int[] diziBirlesik = new int[dizi81.length+dizi82.length];
        for (int i8 = 0; i8 < dizi81.length; i8++)
        {
            diziBirlesik[i8]=dizi81[i8];
        }

        int index8=0;
        for (int i8 = dizi81.length; i8 <diziBirlesik.length; i8++)
        {
            diziBirlesik[i8]= dizi82[index8];
            index8++;
        }
        return diziBirlesik;
    }

/*9*/    public static boolean isUnique(int[] dizi9) {
        for (int i9 = 0; i9 < dizi9.length; i9++)
        {
            for (int j9 = 0; j9 < dizi9.length; j9++)
            {
                if (i9 != j9 && dizi9[i9] == dizi9[j9])
                    return false;
            }
        }
        return true;
    }
}
