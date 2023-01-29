package aOdevler;

import java.util.Scanner;

public class _Odev_2022_11_29_ {
    public static void main(String[] args) {

        // Q1- 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız. _Not: 0 ve 100 dahildir._

        for (int i1=0; i1<=100; i1=i1+2)
            System.out.println("Çift Sayılar= " + i1);

        // Q2- 0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.

        for (int i2=1; i2<=100; i2=i2+2)
            System.out.println("Tek Sayılar= " + i2);

        // Q3- 100'den 0'a kadar bütün tek sayıları yazdırınız.
        //```
        //99-97-95....
        //```
        //`100 ve 0 dahil değildir.`

        for (int i3=99; i3>0; i3=i3-2)
            System.out.println("Sayılar= " + i3);

        // Q4- #  İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.
        //`İlk 10 doğal sayı: 1,2,3,4,5,6,7,8,9,10`

        int toplam4=0;
        for (int i4 = 0 ; i4 <=10 ; i4++)
        {
            toplam4+=i4;
        }
        System.out.println("toplam4= " + toplam4);

        // Q5-  **0 ile 100** arasındaki sayıları kapsayan bir kod yazınız.
            // Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.
            // Eğer sayı çift sayıysa;
            //**This number is even and number is 0**
            // Eğer sayı tek sayıysa;
            //**This number is odd and number is 1**
            //  yazdırmalıdır.
            //`Sonuç böyle olmalıdır.`
            //```
        // This number is even and number is 0
        // This number is odd and number is 1
        // This number is even and number is 2
        // This number is odd and number is 3
        //```
        //...

        for (int i5 = 0; i5 <=100 ; i5++)
        {
            if (i5%2==0) // else geleceği zaman ";" olmayacak. yoksa else yi tanımıyor
                System.out.println("This number is even and number is" + " " + i5);
            else
            {System.out.println("This number is odd and number is" + " " + i5);}
        }

        // Q6- # 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.

//`Sonuç bu şekilde olmalıdır.`

//```
        // 0
        //20
        //40
        //60
        //80
        //100
//```

        int sayac=0;
        for (int i6 = 1; i6 <=100 ; i6++)
        {
            if (i6 % 4 == 0 && i6 % 5 == 0)
            {
                sayac++;
                System.out.println(sayac+". "+"sayı= "+i6);
            }
        }

        // Q7- #  Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız.

        //     _örn:

        //  _length(uzunluk): 7_

        //  _width(genişlik): 5_

        //  _Output:_

//#####

//#####

//#####

//#####

//#####

//#####

//#####

        Scanner oku = new Scanner(System.in);
        System.out.print("length= ");
        int l7 = oku.nextInt();
        System.out.print("width= ");
        int w7 = oku.nextInt();

        for (int i7 = 0; i7 < l7; i7++)
        {
            for (int j7 = 0; j7 < w7; j7++)
            {
                System.out.print("#");
            }
            System.out.println();
        }


        // Q8- # _Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._

        //   Sonuç böyle olmalıdır.
                 //  *
               //  * *
             //  * * *
            // * * * *
           //* * * * *

        for (int i8 = 1; i8 <= 5; i8++)
        {
            for (int j8 = i8; j8 <= 9 - i8; j8++)
            {
                System.out.print(" ");
            }
            for (int k8 = 1; k8 <= i8; k8++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        //  Q9- # _Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._

        //  Sonuç böyle olmalıdır;

        //  *
       //  * *
       // * * *
      // * * * *
    //  * * * * *

        int bosluk9 = 1;

        for (int i9 = 1; i9 <= 5; i9++)
        {
            for (int j9 = i9; j9 < 5; j9++)
            {
                System.out.print(" ");
            }
            for (int k9 = 1; k9 <= bosluk9; k9++)
            {
                if (k9 % 2 == 0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
            bosluk9 = bosluk9 + 2;
        }

        //  Q10 - # do while loop kullanınız.
            //> 0 ile 30 arasındaki bütün çift sayıları yazdırınız.

        int i10 = 0;
        do {
            if (i10 % 2 == 0)
                System.out.println(i10);
                i10++;
            } while (i10 <= 30);

    }
}
