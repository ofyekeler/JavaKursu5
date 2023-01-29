package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        // İki tarih arasındaki farkı gösterir.
        // Sadece LocalDate için kullanılır.

        LocalDate dogumTarihi=LocalDate.of(1989,11,17);
        LocalDate buGun=LocalDate.now();

        Period fark=Period.between(dogumTarihi, buGun); // önce eski sonra yeni/güncel tarihi yazıyoruz.
        System.out.println("fark = " + fark); // fark = P 33Y 1M 26D

        System.out.println("fark.getYears() = " + fark.getYears());   //  fark.getYears() = 33
        System.out.println("fark.getMonths() = " + fark.getMonths()); // fark.getMonths() = 1
        System.out.println("fark.getDays() = " + fark.getDays());     //   fark.getDays() = 26

        System.out.println(fark.getYears()+" Yaşındasınız"); // 33 Yaşındasınız

        /* **************************************************** */

        Period period3Gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);

        System.out.println("period3Gun = " + period3Gun); // period3Gun = P 3D
        System.out.println("period3Ay = " + period3Ay);   //  period3Ay = P 3M

        LocalDate ucAySonra=buGun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra); // ucAySonra = 2023-04-12

        // Kursun bitiş tarihini bulunuz 6 ay - 31 Ekim 2022
        LocalDate kursBaslangic= LocalDate.of(2022,10,31);
        Period kursSure= Period.ofMonths(6);
        LocalDate kursBitis= kursBaslangic.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);  // kursBitis = 2023-04-30
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek()); // kursBitis.getDayOfWeek() = SUNDAY

        Period neKadarSureKaldi= Period.between(buGun,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi); // neKadarSureKaldi = P 3M 18D

        // Kurs ne kadar süredir devam ediyor?
        Period suAnaKadarDevamSuresi= Period.between(kursBaslangic,buGun);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi); // suAnaKadarDevamSuresi = P 2M 12D
    }
}
