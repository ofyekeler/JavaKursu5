package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // Kullanıcıdan alınan ve string durumundaki time ve date bilgisinin
        // time veya date bilgisine çevrilmesi.

        long startTime = System.currentTimeMillis(); // kodun performansı

        Scanner oku = new Scanner(System.in);
        System.out.print("Tarih giriniz (25 01 2023)= ");
        String strTarih = oku.nextLine(); // 12 01 2023

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate gercekTarih = LocalDate.parse(strTarih , f);

        System.out.println("gercekTarih = " + gercekTarih); // gercekTarih = 2023-01-12

        long finishTime = System.currentTimeMillis();
        System.out.println("Geçen Süre = " + ((finishTime-startTime)/1000)+" sn"); // Geçen Süre = 2 sn
    }
}
