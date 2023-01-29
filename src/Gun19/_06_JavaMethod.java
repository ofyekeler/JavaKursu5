package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz(); // Math.random(); // 2 kere sout yazdıracak, aşağıda 2 tane var.
        merhabaYazIsme("ismet"); // Math.Abs(-10)
        cokMerhabaYaz(5);

    }
    public static void merhabaYaz(){

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

    }
    public static void merhabaYazIsme(String isim){ // isim(parametre)'i yukarıdaki string e aşitledi

        System.out.println(isim+"merhaba");
    }
    public static void cokMerhabaYaz(int miktar){

        for (int i = 0; i < miktar; i++)
        {
            System.out.println("merhaba");
        }
    }
/*
Merhaba Dünya
Merhaba Dünya

ismetmerhaba

merhaba
merhaba
merhaba
merhaba
merhaba
*/
}
