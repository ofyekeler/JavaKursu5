package Gun43_HataKomutlari;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program çalışmaya başladı");

        try { // DENE, hatanın başladığı yerin üstüne konur.
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);
            System.out.println("Program bitti");
        }
        catch (Exception ex){ // ex isimli değişkende oluşan hataların bilgisi atanıyor.
                            // hata olduğunda yapılması istenenler buraya yazılıyor.
            System.out.println("Hata oluştu, lütfen tekrar deneyiniz.");
            System.out.println("Tüm hata mesajı= "+ex);
            System.out.println("Hata açıklamasıı= "+ex.getMessage());
            // kendine hata mesajını kendine mail atabilirsin.
            // LOG TUTMA: program nasıl çalışıyor, hata loglarını DB yazabilirsin.
        }
        System.out.println("Program bitti.");
/*
program çalışmaya başladı
Hata oluştu, lütfen tekrar deneyiniz.
 Tüm hata mesajı= java.time.DateTimeException: Invalid date 'FEBRUARY 30'
Hata açıklamasıı= Invalid date 'FEBRUARY 30'
Program bitti.
*/
        try {
            // Java ve Tool ları çalışmaya devam et
            // Konuları öğrenmeye ve çalışmaya devam et
        }   // anlamadığın yer mi oldu? Kırılmadan devam et
        catch (Exception ex){
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // gereken videoları izle
            // grup çalışması yap
            // öğren ve kırılmadan devam et
            // unutma, sen bir söz verdin, DEVAM
        }
        // Sonunda seni güzel bir meslek bekliyor.
    }
}
