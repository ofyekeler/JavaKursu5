package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();

                 System.out.println("Tarih= "+ tarih);
                  System.out.println("Yıl= " + tarih.getYear());
                   System.out.println("Ay= " + tarih.getMonth());
            System.out.println("Ay sayısı= " + tarih.getMonthValue());
            System.out.println("Ayın Günü= " + tarih.getDayOfMonth());
        System.out.println("Haftanın günü= " + tarih.getDayOfWeek());
System.out.println("Haftanın kaçıncı günü= " + tarih.getDayOfWeek().getValue());
   System.out.println("Yılın kaçıncı günü= " + tarih.getDayOfYear());

        // kendisindeki hazır formatlara bakalım

     System.out.println("ISO DATE= "+tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n********************");
        // Localde aldığım tarihi istediğim ülkenin formatına göre, diline göre nasıl gösteririm?
        // Örneğin localdeki saati Almanya ki saate nasıl dönüştürebiliriz?

        System.out.println("FULL Almanya gösterimi = "+
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        // Lokalizasyon tanımlaması.
        // en-US: birincisi DİLİ, ikincisi ise ülkeyi temsil ediyor. Amerikan ingilizcesi anlamında.
        // en-UK: UK ingilizcesi.
        // fr-CA: Kanada fransızcası
        // en-CA:
        // tr-TR:
        System.out.println("\n********************");

        Locale[] kullanilabilirLokaller=Locale.getAvailableLocales();
        for (Locale l:kullanilabilirLokaller)
        {
            if (l.getDisplayCountry().toLowerCase().contains("çin"))
            {
            System.out.print("Dil = " + l.getDisplayLanguage());
            System.out.print(", Ülke = " + l.getDisplayCountry());
            System.out.print(", = " + l.getLanguage());
            System.out.println(" - " + l.getCountry());
            }
        }

        Locale lokalCince=new Locale("zh","CN");
        System.out.println("FULL Çince gösterimi= \n"+
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println("tarih dd/MM/yyy = "+tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy = "+tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyy");
        System.out.println("EEEE dd.MM.yyy = "+tarih.format(ozelFormat3));
        System.out.println("Özel format ve loc. EEEE dd.MM.yyy = "+tarih.format(ozelFormat3.withLocale(Locale.UK)));

        DateTimeFormatter ozelFormat4=DateTimeFormatter.ofPattern("EE dd.MM.yyy");
        System.out.println("EE dd.MM.yyy = "+tarih.format(ozelFormat4));

        DateTimeFormatter ozelFormat5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyy");
        System.out.println("MMMM dd.MM.yyy = "+tarih.format(ozelFormat5));

        System.out.println("\n********************");
        // Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5
        LocalDate tarih1=LocalDate.of(2000,5,20);
        System.out.println("tarih1.format(ozelFormat1) = " + tarih1.format(ozelFormat1));

        LocalDate tarih2=LocalDate.of(1999, Month.MARCH,12);
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));
    }
}
/*
                Tarih= 2023-01-12
                  Yıl= 2023
                   Ay= JANUARY
            Ay sayısı= 1
            Ayın Günü= 12
        Haftanın günü= THURSDAY
Haftanın kaçıncı günü= 4
   Yılın kaçıncı günü= 12
             ISO DATE= 2023-01-12
                SHORT= 12.01.2023
               MEDIUM= 12 Oca 2023
                 LONG= 12 Ocak 2023
                 FULL= 12 Ocak 2023 Perşembe
********************
FULL Almanya gösterimi = Donnerstag, 12. Januar 2023

********************
Dil = Çince, Ülke = Çin, = zh - CN

FULL Çince gösterimi=
2023年1月12日星期四

                   tarih dd/MM/yyy = 12/01/2023
                      tarih d.M.yy = 12.1.23
                    EEEE dd.MM.yyy = Perşembe 12.01.2023
Özel format ve loc. EEEE dd.MM.yyy = Thursday 12.01.2023
                      EE dd.MM.yyy = Per 12.01.2023
                    MMMM dd.MM.yyy = Ocak 12.01.2023

tarih1.format(ozelFormat1) = 20/05/2000
tarih2.format(ozelFormat1) = 12/03/1999
*/
