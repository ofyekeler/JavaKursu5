package Gun28._01_Constructor_YapiciMetodlar;

public class Okul {
    public static void main(String[] args) {

        // 1. Yol
        Ogrenci ogr1=new Ogrenci(); // nesne oluşma anı
        ogr1.id=1;  // özelliklerini, değerlerini veriyorum.
        ogr1.ad="ismet";
        ogr1.soyad="temur";
        ogr1.sinif=5;
/*
nesne oluşturuldu
*/
        System.out.println("ogr1.ad = " + ogr1.ad);
/*
ogr1.ad = ismet
*/

        // 2. Yol
        Ogrenci ogr2=new Ogrenci(2,"mehmet","yılmaz",5);
        System.out.println("ogr2.ad = " + ogr2.ad);
/*
ogr2.ad = mehmet
*/
        // 3. Yol (2. yolun farklı yazılışı)
        Ogrenci ogr3=new Ogrenci(2,"Ayşe","Bayrak");
        System.out.println("ogr3 ad= " + ogr3.ad);
/*
ogr3 ad= Ayşe
*/
    }
}