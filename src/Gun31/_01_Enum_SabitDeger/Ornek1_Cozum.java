package Gun31._01_Enum_SabitDeger;

public class Ornek1_Cozum {
    enum Aylar{
        TANIMSIZ, OCAK, SUBAT, MART, NİSAN, MAYIS, HAZIRAN,
        TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
              }
// TODO: Yazılım dillerinde ENUM, enumaration ve enum sabitleri olarak adladırılmaktadır.
//  Tanımlanan değişkenlerin SABİT DEĞER ALMASI İÇİN kullanılır.
//  Tanımlanan bu sabit değerler bir grup oluşturur. SİMGELEŞTİRİR.
//  Erişilmesi, yönetilmesi ve anlaşılması kolay hale gelir.

    public static void main(String[] args) {

        Aylar ay=Aylar.MAYIS;

        switch (ay){
            case SUBAT: System.out.println(28); break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK: System.out.println(31); break;
            case NİSAN:
            case HAZIRAN:
            case EYLUL:
            case KASIM: System.out.println(30); break;
        }
        if (ay == Aylar.MAYIS)
        {
            System.out.println("Zam yapıldı.");
        }
        System.out.println("ay = " + ay); // toString
        System.out.println("ay.name() = " + ay.name()); // SİMGE olarak kul...
        System.out.println("ay.ordinal() = " + ay.ordinal()); // index sırası
/*
31
Zam yapıldı.
ay = MAYIS
ay.name() = MAYIS
ay.ordinal() = 5
*/
    }
}
