package Gun05;

import java.util.Scanner;

public class _01_JavaScanner_EkrandanOkuma {
    public static void main(String[] args) {

        // tipi  -  adı -     ilk değeri  - işlem tamam,        bu adımı çalıştır.
            int     sayi          =0            ;

        Scanner okuyucu=new Scanner(System.in);
      // tipi    adı    yeni okuyucu  (klavyeden - konsoldan)
        // dışarıdan yani alt ekrandan(run) girilen değeri bu ekrandan okuma işlemi yapar.
                         /* Scanner ...=new Scanner(System.in);
    (Integer, String, Double v.s.) ,,, = ...  .nextInt();  parantez içini boş bırakırız ki
                                          buraya değer run ekranından girilebilsin.
                    yukarıda next ten sonra gelen "Int" değişebilir.
                    Line, Short, Double v.s. String için sadece next yazılır*/

        System.out.print("Sayi Giriniz="); // sordurma, okuma bölümü

        sayi=okuyucu.nextInt(); // kursor bekliyor sayı girişi için
        // alt tarafta "run" bölümünde çıkacak olan "sayi=" in sağına ramak gireceksin.
        // rakam girilip enter a basıldğında değeri aşağıdan alıp yukarıya sayıya atıyor.
        // "sayi" bölümüne "Integer sayi" da yazılabilirdi. Zaten sistem tek bir sayı gördü mü int olarak okuyor.

        System.out.println("sayi = " + sayi); // yazdırma bölümü

        //Sayi Giriniz= "5+enter"
        //sayi = 5  gibi
        // burada amaç, dışarıdan alınan veriyi okumaktır.
    }
}
