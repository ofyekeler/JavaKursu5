package Gun24;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Ornek1_Devam {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        TreeMap<String, String> sozluk = new TreeMap<>();
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        int secim;

        do {

            System.out.print("Aşağıdaki menüden bir numara seçiniz\n");
            System.out.print("1- Ekleme\n" +
                    "2- Düzeltme \n" +
                    "3- Listeleme\n" +
                    "4- Arama\n" +
                    "5- Silme\n" +
                    "6- Çıkış\n" +
                    "Seçiminiz : ");

            secim = okuInt.nextInt();


            switch (secim) {
                case 1:
                    kelimeGir(sozluk);
                    break;
                case 2:
                    kelimeDuzelt(sozluk);
                    break;
                case 3:
                    listele(sozluk);
                    break;
                case 4:
                    arama(sozluk);
                    break;
                case 5:
                    silme(sozluk);
                case 6:
                    break;
                default:
                    System.out.println("hatalı giriş");
            }
        } while (secim!=6);
    }
    public static TreeMap kelimeGir(TreeMap s1) // Sözlüğe Kelime giriş methodu
    {
        Scanner okuStr = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String klm = okuStr.nextLine();
        System.out.print("Anlamını giriniz: ");
        String anlam = okuStr.nextLine();
        s1.put(klm, anlam);

        return s1;
    }
    public static TreeMap kelimeDuzelt(TreeMap s2) // Sözlükte Kelime düzeltme methodu
    {
        Scanner okuStr = new Scanner(System.in);
        System.out.print("Düzeltmek istediğiniz kelimeyi yazın : ");
        String duzeltilecek = okuStr.nextLine();
        System.out.println(duzeltilecek + " " + s2.get(duzeltilecek));
        System.out.print("Bunun yerine gireceginiz kelimeyi giriniz : ");
        String yeniKlm = okuStr.nextLine();
        System.out.print("Anlamını giriniz : ");
        String yeniAnlam = okuStr.nextLine();
        s2.remove(duzeltilecek);
        s2.put(yeniKlm, yeniAnlam);
        System.out.print("Düzelttiğiniz kelime başarıyla kaydedildi.\n");
        return s2;
    }
    public static void listele(TreeMap<String, String> s3) // Sözlüğü listeleme Methodu
    {
        for (Map.Entry<String, String> kv : s3.entrySet()) {
            System.out.println(kv.getKey() + " \t= " + kv.getValue());
        }
    }
    public static void arama(TreeMap<String, String> s4) // Sözlükte kelime arama methodu
    {
        Scanner okuStr = new Scanner(System.in);
        System.out.print("Aradığınız kelimeyi giriniz :");
        String arama = okuStr.nextLine();


        ArrayList<String> kelimeListe=new ArrayList<>();
        kelimeListe.addAll(s4.keySet()) ;
        for (int i = 0; i < kelimeListe.size(); i++) {
            if(kelimeListe.get(i).contains(arama))
                System.out.println( kelimeListe.get(i)+ "= " +s4.get(kelimeListe.get(i)));
        }
    }

    public static TreeMap silme(TreeMap s5) // Sözlükten kelime silme methodu
    {
        Scanner okuStr = new Scanner(System.in);
        System.out.print("Silmek istediğiniz kelimeyi giriniz :");
        String sil = okuStr.nextLine();
        System.out.println(s5.get(sil) + "\nBu kayıt silindi.");
        s5.remove(sil);
        return s5;
    }
}