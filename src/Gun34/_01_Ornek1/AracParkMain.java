package Gun34._01_Ornek1;

public class AracParkMain {
    // 1- Arac isimli bir superclass olusturunuz, fields : renk, motorHacmi, marka olsun.
    // 2- Consructor ekleyiniz. get ve set metodları ve toString Metodunu ekleyiniz.
    // 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuKapasitesi field ını ekleyiniz.
    // 4- Bir AracPark isimli içinde main olan bir sınıf olucturunuz ve Otobus ten
    //    nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.

    /* OOP:
       1- Encapsulation (Kapsüleme: Private - get - set)
       2- Inheritance (base ve sub class)
       3-
       4-
     */
    public static void main(String[] args) {

        Otobus otobus1=new Otobus("Beyaz","4500","Mercedes",42);
        Arac arac1=new Arac("Gri","2000","VW");

        System.out.println("otobus1 = " + otobus1);
        System.out.println("arac1 = " + arac1);
/*
otobus1 = Arac{renk='Beyaz', motorHacmi='4500', marka='Mercedes'}42
  arac1 = Arac{renk='Gri', motorHacmi='2000', marka='VW'}
*/
    }
}
