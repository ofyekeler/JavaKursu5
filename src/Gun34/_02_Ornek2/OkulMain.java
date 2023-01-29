package Gun34._02_Ornek2;

public class OkulMain {
    // 1- Ogrenci isimli id,isim ve tipi(ENUM ILK,ORTA,LISE)  olan bir class oluşturunuz.
    // 2- LiseOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz, field: brans (String,  MF,TM)
    // 3- İlkokulOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,  filed: klup  (String SATRANC, TIYATRO ..)
    // 4- Okul isimli mainde 3 adet farklı tipte öğrenci oluşturunuz,
    // 5- Oluşturuken her öğrenciye, Ogrenci sınıfında tanımlanmış bir sayaçtan no veriniz.
    public static void main(String[] args) {

        LiseOgrencisi lo1=new LiseOgrencisi("ismet temur",Tipi.LISE,"SAY");
        LiseOgrencisi lo2=new LiseOgrencisi("ayşe lavaş",Tipi.LISE,"SÖZ");

        IlkokulOgrencisi io1=new IlkokulOgrencisi("zeynep bayrak",Tipi.ILK,"Satranç");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io1 = " + io1);
    }
/*
lo1 = Ogrenci{id=1, isim='ismet temur', tipi='LISE'}SAY
lo2 = Ogrenci{id=2, isim='ayşe lavaş', tipi='LISE'}SÖZ
io1 = Ogrenci{id=3, isim='zeynep bayrak', tipi='ILK'}Satranç
*/
}
