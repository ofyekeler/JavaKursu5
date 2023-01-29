package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_Ornek1 {
    public static void main(String[] args) {

        ArrayList<Integer> matNotlari=new ArrayList<>(); // matematiğin ders notları
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

        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız.
        // Matematik: 40  50  60
        // Fizik: 30  40
        // Kimya: 70  80  90  100

        ArrayList<String>dersListe=new ArrayList<>(Arrays.asList("Matematik","Fizik","Kimya"));

        for (int i = 0; i < notlarListesi.size(); i++)
        {
            System.out.print(dersListe.get(i)+": ");
            for (int j = 0; j <notlarListesi.get(i).size() ; j++)
            {
                System.out.print(notlarListesi.get(i).get(j)+"\t"); // [i][j]
            }
            System.out.println();
        }
        // Soru 2:
        // Kullanıcıdan istediği bir dersin no sunu alarak (0-Mat, 1-Fiz,2-Kim)
        // Sadece istediği derse ait notları bir metodda yazdırınız.

        System.out.println("***************************************");

        Scanner oku=new Scanner(System.in);
        System.out.print("Ders No (0-Mat, 1-Fiz, 2-Kim)= ");
        int dersNo=oku.nextInt();

        dersNotlariniYazdir(dersNo, notlarListesi);

        // Soru 3:
        // Yukarıda verilen derse ait not ortalamasını ve ort. geçen sayısını bir metodda yazdırınız.
        System.out.println("***************************************");

        dersOrtVeGecenMikBul(dersNo, notlarListesi);
    }
    public static void dersNotlariniYazdir (int dersNo,ArrayList<ArrayList<Integer>>notlarListesi){

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.print(notlarListesi.get(dersNo).get(i)+"\t");
        }
    }
    public static void dersOrtVeGecenMikBul (int dersNo,ArrayList<ArrayList<Integer>>notlarListesi){

        int toplam=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam+=notlarListesi.get(dersNo).get(i);
        }
        int ort=toplam/notlarListesi.get(dersNo).size();
        int gecenMik=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            if (notlarListesi.get(dersNo).get(i)>=ort)
                gecenMik++;
        }
        System.out.println("ort = " + ort);
        System.out.println("gecenMik = " + gecenMik);
    }
}
