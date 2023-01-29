package Gun39._01_OOP_Soru1;

public class ZooMain {
    /* 1- id(int) ,isim(String), vahsi(boolean), dogumTarihi (String) fieldları olan ve
   void yiyecegi, void yemekMiktari, void gunlukUykuSuresi ve void sesi isimlerinde abstract metodları,
   toString şeklinde normal metodu ve get ve set leri olan Hayvan isminde
   bir abstract class yazınız.
       2- Kedi, kartal şeklinde 2 tane extend alacak normal class yazınız.
       3- Main de 1 er nesne oluşturup, değerlerini atayıp, yazdırınız.
       4- Benzersiz ID leri olmalı, buna göre güvenli dizayn yapınız. */
    public static void main(String[] args) {
        Kedi kd=new Kedi("Köpük",false, "01.01.2015");
        System.out.println("Kedi= " + kd);

        Kartal kr=new Kartal("Kara Kartal",true, "01.01-5.2017");
        System.out.println("Kartal= " + kr);
    }
}
/*
yiyecegi=Kedi maması
Yemek Miktarı=100 gr
Günlük Uyku Süresi=16 saat
sesi=Miyav
Kedi= Hayvan{id=1, isim='Köpük', vahsi=false, dogumTarihi='01.01.2015'}

yiyecegi=Et
Yemek Miktarı=Günlük 1 kg
Günlük Uyku Süresi=8 saat
sesi=Ciyak fiyuu
Kartal= Hayvan{id=2, isim='Kara Kartal', vahsi=true, dogumTarihi='01.01-5.2017'}
*/
