package Gun20;

import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {

        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini
        // bir metodda yaptıktan sonra main de yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz= ");
        int sayi1= oku.nextInt();
        System.out.print("2. sayıyı giriniz= ");
        int sayi2= oku.nextInt();

        int anb=enbBul(sayi1,sayi2);
        System.out.println("Büyük Olan Sayı= " + anb);

    }
    public static int enbBul(int s1, int s2) {

        int donecek;
        if (s1>s2)
            donecek=s1;
        else
            donecek=s2;

        return donecek;

        // 2. yöntem (kısayol) --->  return s1>s2 ? s1 : s2;
        // 3. yöntem
           /* if (s1>s2)
                  return s1;
              else
                  return s2; */

    }
/*
1. sayıyı giriniz= 5
2. sayıyı giriniz= 9
  Büyük Olan Sayı= 9
*/

}
