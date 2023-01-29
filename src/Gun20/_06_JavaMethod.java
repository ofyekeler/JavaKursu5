package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {

        int s1=4;
        int s2=12;
        int s3=34;
        int s4=23;

        int sonuc1=toplamBul(s1,s2);
        int sonuc2=toplamBul(s1,s2,s3);
        int sonuc3=toplamBul(s1,s2,s3,s4);
        // parametreler aynı tip, sadece miktarları farklı
        // bu tip durumlar için bir kolaylık sağlamış.

        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
    }
// .. ile ilgili 2 kural var
    // 1- bir metodda parametre olarak sadece 1 tane olabilir.
    // 2- Her zaman son parametre olmalı
    public static int toplamBul(int ... sayilar){// gelen kaç sayı olursa olsun hepsini al,
                                                 // dizi şeklinde metoda al "..."
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++)
        {
            toplam+=sayilar[i];
        }
        return toplam;
    }
//    public static int toplamBul(int s1, int s2){
//        return s1+s2;
//    }
//    public static int toplamBul(int s1, int s2, int s3){
//        return s1+s2+s3;
//    }
//    public static int toplamBul(int s1, int s2, int s3, int s4){
//        return s1+s2+s3+s4;
//    }
}
