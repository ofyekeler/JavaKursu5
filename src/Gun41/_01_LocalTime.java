package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _01_LocalTime {
    public static void main(String[] args) {
        // LocalTime: Tarih bilgisi içermez. Sadece saat, dakika, saniye ve nano sn içerir.

        LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat); // saat = 19:07:56.134858600

        System.out.println("saat.getHour() = " + saat.getHour()); // saat.getHour() = 19
        System.out.println("saat.getMinute() = " + saat.getMinute()); // saat.getMinute() = 9
        System.out.println("saat.getSecond() = " + saat.getSecond()); // saat.getSecond() = 14
        System.out.println("saat.getNano() = " + saat.getNano()); // saat.getNano() = 357375900
        
        // Kendimize özel format oluşturalım.
        DateTimeFormatter of1=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("saat hh:mm a = " + saat.format(of1)); // saat.format(of1) = 07:11 ÖS

        DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat kk:mm = " + saat.format(of2));  // saat kk:mm = 19:13

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("k:mm");
        System.out.println("saat k:mm = " + saat.format(of3)); // saat k:mm = 19:13

        /* ************** Saati kendimiz belirleyelim ************* */
        LocalTime saat1=LocalTime.of(7,34,45);
        System.out.println("saat1.format(of3) = " + saat1.format(of3)); // saat1.format(of3) = 7:34
    }
}
