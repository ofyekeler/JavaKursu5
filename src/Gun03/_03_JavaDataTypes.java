package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi;  // hafıza int kadar yer ayırıyor, sadece tam sayı atılabiliyor.
        // tam sayılarda default INT

        // tam sayılar
        byte byteDeger = 7;  // -128  127  arası sayı kullanılacaksa eğer...
        short shortDeger = 1645;  // -32000   32000
        int intDeger = 250000;
        long longDeger = 232323232323232L;  // long larda sayının sonuna L ekle. çünkü int i taşan bir sayı var.
                                            // yani default tan fazla sayı olduğu için.
                                            // benzeri, aşağıdaki float için de geçerli.

        // ondalık sayılar
        // ondalıklı sayılarda Default DOUBLE dır.
        double doubleDeger = 3.144545454; // virgülden sonraki hassasiyet 16 ya kadar çıkıyor.
        float floatDeger = 3.144343F; // sonuna F koyuyorsun. virgülden sonraki hassasiyet 7

        // karakter ve karakterler
        char basHarf = 'A';  // bir tane karakter saklayabilir. Tek tırnaklı.
        String isim = "faruk"; // kelime veya cümle saklayabilir. Çift tırnaklı.

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);

        //byteDeger = 7
        //shortDeger = 1645
        //intDeger = 250000
        //longDeger = 232323232323232
        //doubleDeger = 3.144545454
        //floatDeger = 3.144343
        //basHarf = A
        //isim = faruk

    }
}
