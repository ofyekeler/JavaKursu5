package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _04_LocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime hem tarih hem de saat bilgisiini tutar.

        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt); // dt = 2023-01-12T20:06:10.368938500

                System.out.println("dt.getYear() = " + dt.getYear());                 //                 dt.getYear() = 2023
               System.out.println("dt.getMonth() = " + dt.getMonth());                //                dt.getMonth() = JANUARY
          System.out.println("dt.getMonthValue() = " + dt.getMonthValue());           //           dt.getMonthValue() = 1
           System.out.println("dt.getDayOfYear() = " + dt.getDayOfYear());            //            dt.getDayOfYear() = 12
          System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());           //           dt.getDayOfMonth() = 12
           System.out.println("dt.getDayOfWeek() = " + dt.getDayOfWeek());            //            dt.getDayOfWeek() = THURSDAY
System.out.println("dt.getDayOfWeek().getValue() = " + dt.getDayOfWeek().getValue()); // dt.getDayOfWeek().getValue() = 4
                System.out.println("dt.getHour() = " + dt.getHour());                 //                 dt.getHour() = 20
              System.out.println("dt.getSecond() = " + dt.getSecond());               //               dt.getSecond() = 24
                System.out.println("dt.getNano() = " + dt.getNano());                 //                 dt.getNano() = 462935800
        System.out.println("ISO_DATE = "+dt.format(DateTimeFormatter.ISO_DATE_TIME)); //                     ISO_DATE = 2023-01-12T20:14:04.525056
        System.out.println("SHORT = "+dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT))); //  SHORT = 12.01.2023 20:15
        System.out.println("MEDIUM = "+dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));//MEDIUM = 12 Oca 2023 20:16:19
        
        // özel formatta istediğimiz gibi yazdırma
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("dt.format(f) = " + dt.format(f)); // dt.format(f) = 12.01.2023 08:17
    }
}
