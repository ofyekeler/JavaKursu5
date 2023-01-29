package Gun41;

import java.time.LocalDate;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate buGun = LocalDate.now();
        LocalDate dun = buGun.minusDays(1);

        boolean sonraMi = buGun.isAfter(dun); // bugün dün den sonra mı?
        System.out.println("sonraMi = " + sonraMi); // true

        boolean onceMi = buGun.isBefore(dun); // bugün dünden önce mi?
        System.out.println("onceMi = " + onceMi); // false

        boolean esitMi = buGun.isEqual(dun);
        System.out.println("esitMi = " + esitMi); // false

        boolean artikYilMi = buGun.isLeapYear(); // bugün artık yıl mı? (şubat 29 çekiyor mu?
        System.out.println("artikYilMi = " + artikYilMi); // false


    }
}
