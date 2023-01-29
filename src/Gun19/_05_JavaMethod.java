package Gun19;

public class _05_JavaMethod {

    // buraya metodlar yazılabilir

    public static void main(String[] args) { // ada metod, diğer metodları buradan çağıracağız.

    Math.max(5,6); // bir şeyler verilmiş, geriye değer alınıyor
    Math.random(); // veri almıyor, sadece veri veriyor
    // ----------------------------------------

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // aşağıda methodu(fonksiyonu) oluşturduk ve çağırdık.
        merhabaYaz(); // kullanımı kolay, çağırması kolay.
        merhabaYaz(); // main in daha kolay anlaşılır olur.
/*
Merhaba Dünya
Merhaba Dünya
Merhaba Dünya
Merhaba Dünya
Merhaba Dünya
Merhaba Dünya
*/
    }
    public static void merhabaYaz(){ // main ve sonrasını sildik
                                    // ve "kendi metod adımızı()" yazdık.

        System.out.println("Merhaba Dünya");
    }
    // buraya metodlar yazılabilir.
}
