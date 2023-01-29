package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        // Duration: Hem LocalTime hem de LocalDateTime arasındeki farkı verir.

        // LocalTime
        LocalTime dersBaslangic = LocalTime.of(19,0,0);
        LocalTime dersBitis = LocalTime.of(22,0,0);

        Duration gunlukDersSuresi = Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi); // gunlukDersSuresi = PT 3H

        System.out.println("gunlukDersSuresi.toHours() = " + gunlukDersSuresi.toHours());     //   gunlukDersSuresi.toHours() = 3
        System.out.println("gunlukDersSuresi.toMinutes() = " + gunlukDersSuresi.toMinutes()); // gunlukDersSuresi.toMinutes() = 180
        System.out.println("gunlukDersSuresi.toSeconds() = " + gunlukDersSuresi.toSeconds()); // gunlukDersSuresi.toSeconds() = 10800
        System.out.println("gunlukDersSuresi.toMillis() = " + gunlukDersSuresi.toMillis());   //  gunlukDersSuresi.toMillis() = 10800000
        System.out.println("gunlukDersSuresi.toNanos() = " + gunlukDersSuresi.toNanos());     //   gunlukDersSuresi.toNanos() = 10800000000000

        // LocalDateTime *** 2 Tarih-saat arasındaki fark ***
        LocalDateTime from = LocalDateTime.of(2023,1,1, 0,0);
        LocalDateTime to = LocalDateTime.now();

        Duration farkZaman = Duration.between(from, to);
        System.out.println("farkZaman = " + farkZaman); // farkZaman = PT _ 285-H 21-M 59.5474684-S
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays()); // farkZaman.toDays() = 11
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours()); // farkZaman.toHours() = 285
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes()); // farkZaman.toMinutes() = 17123
    }
}
