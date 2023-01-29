package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    public static void main(String[] args) {

        // Başka zaman bölgelerinin (Time Zone) zaman bilgisini alma

        ZonedDateTime zdt = ZonedDateTime.now(); // şu anda benim bulunduğum default zamanı verir.
        System.out.println("zdt = " + zdt); // zdt = 2023-01-12 T 21:33:33.025237600 +03:00[Europe/Istanbul]

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();
        for (String z : zamanBolgeleri)
        {
            if(z.toLowerCase().contains("lond"))
            System.out.println("z = " + z); // z = Europe/London
        }
        ZoneId zoneIdLondra = ZoneId.of("Europe/London");
        ZonedDateTime zoneLondra = ZonedDateTime.now(zoneIdLondra);
        System.out.println("zoneLondra = " + zoneLondra); // zoneLondra = 2023-01-12 T 18:33:33.025237600 Z[Europe/London]
    }
}
