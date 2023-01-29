package Gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {

        // Aynı fonksiyon farklı parametrelerle ve türlerle kullanılabilir.

        int s1=4;
        int s2=12;
        int s3=34;

        int sonuc1=toplamBul(s1,s2);
        int sonuc2=toplamBul(s1,s2,s3);

        String ad="Faruk";
        String soyad="YEKELER";

        String sonuc3=toplamBul(ad,soyad);

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }
    public static int toplamBul(int s1, int s2){
        return s1+s2;
    }
    public static int toplamBul(int s1, int s2, int s3){
        return s1+s2+s3;
    }
    public static String toplamBul(String ad, String soyad){
        return ad+" "+soyad;
    }
/*
sonuc1 = 16
sonuc2 = 50
sonuc3 = Faruk YEKELER
*/
}
