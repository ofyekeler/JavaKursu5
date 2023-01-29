package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        String ad="Faruk"; // String: kelime veya kelimeleri saklamak için kullanılır.
                           // sınırlarını "  " ile belirlenir.

        String soyad="YEKELER";
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad ve soyad = " + ad + "\t" + soyad); // + lar burada stringler arası
                                                                 // olduğu için birleştirir.

        //ad = Faruk
        //soyad = YEKELER
        //ad ve soyad = Faruk YEKELER

        String tamAd= "faruk" + " " + "yekeler";
        System.out.println("tamAd = " + tamAd);

        // tamAd = faruk yekeler
    }
}
