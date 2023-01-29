package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        // String lerde neden == yerine EQUAL kullanılır?
        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        // İLKEL Tipleri karşılaştırdığından 2 sinde de değerleri karşılaştırır.
        // Çünkü başka bir şeyi yok.
        if(cumle1 == cumle2) // değer üzerinden kıyaslar, hücre kıyası yapmaz.
            System.out.println("cümle 1 cümle 2 ye eşittir.");
        else
            System.out.println("cümle 1 cümle 2 ye eşit değildir.");  // cümle 1 cümle 2 ye eşittir.
        if(cumle1.equals(cumle2)) // değer üzerinden kıyaslar, hücre kıyası yapmaz.
            System.out.println("cümle 1 cümle 2 ye eşittir.");        // cümle 1 cümle 2 ye eşittir.
        else
            System.out.println("cümle 1 cümle 2 ye eşit değildir.");

        //*************Referans Tiplerde ise durum****************/
        // scanner le ekrandan okuduğunda aşağıdaki gibi oluyor.

        String cumle3 = new String("Bugün hava çok güzel");
        String cumle4 = new String("Bugün hava çok güzel");

        if(cumle3 == cumle4) // adresleri karşılaştırır.
            System.out.println("cümle 3 cümle 4 e eşittir.");
        else
/**/        System.out.println("cümle 3 cümle 4 e eşit değildir."); // cümle 3 cümle 4 e eşit değildir.

        if(cumle3.equals(cumle4)) // değerleri aynı mı
            System.out.println("cümle 3 cümle 4 e eşittir.");
        else
            System.out.println("cümle 3 cümle 4 e eşit değildir."); // cümle 3 cümle 4 e eşittir.

        // scaner ile ekrandan okurken == sorgusu patlıyor. Bu yüzden EQUALS kullanıyoruz.
    }
}
