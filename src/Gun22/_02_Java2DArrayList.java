package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

        int sayi=5; // tek bir rakam tutabilen bir değişken
        int[]dizi=new int[20];  // 20 adet sayı saklayabilen bir değişken, uzunluğu sabit
        int [][]tablo=new int[20][2]; // 20x2 lik sayı saklayabilen değişken, uzunluğu sabit

        ArrayList<Integer>liste=new ArrayList<>(); // istenildiği kadar sayı eklenebilen, uzunluğu değişken

        // bir sınıf var ortada, bu sınıfta 20 kişi var ve bunların 3 dersi olsun.
        // bunlardan bazıları raporlu olabilir. her öğrenci her sınava girmiyor olabilir.
        // öğrencilerin bu notlarını nasıl bir değişkende saklayabilirim?

        ArrayList<Integer>matNotlari=new ArrayList<>(); // matematiğin ders notları
        ArrayList<Integer>fizNotlari=new ArrayList<>(); // matematiğin ders notları
        ArrayList<Integer>kimNotlari=new ArrayList<>(); // matematiğin ders notları

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        // ArrayList in ArrayList ini nasıl yaparım?
        ArrayList< ArrayList < Integer > >notlarListesi=new ArrayList<>(); // List'lerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        notlarListesi.get(0); // bana Matematik notlarını verir
        int matBirNot=notlarListesi.get(0).get(0); // Mat. notlarının ilkini verir. (Get'in get'i)
        int kimUcuNot=notlarListesi.get(2).get(3); // Kim. notlarının 3.'sü nü verir.

        System.out.println("notlarListesi = " + notlarListesi);
        System.out.println("matBirNot = " + matNotlari);
        System.out.println("fizNotlari = " + fizNotlari);
        System.out.println("kimNotlari = " + kimNotlari);
        System.out.println("matBirNot = " + matBirNot);
        System.out.println("kimUcuNot = " + kimUcuNot);

        // yukarıdakilerin yerine FOR döngüsünü nasıl kullanırdık?
        for (int i = 0; i < notlarListesi.size(); i++)
        {
            System.out.println("notlarListesi.get("+i+") = " + notlarListesi.get(i)); // "+i+" yapınca i'nin değerini yazar
        }

        // 2 tane FOR la nasıl yapardık? Satır/Sütun şeklinde
        for (int i = 0; i < notlarListesi.size(); i++)
        {
            for (int j = 0; j <notlarListesi.get(i).size() ; j++)
            {
                System.out.print(notlarListesi.get(i).get(j)+"\t"); // [i][j]
            }
            System.out.println();
        }
    }
}
