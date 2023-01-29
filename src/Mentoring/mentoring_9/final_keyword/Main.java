package Mentoring.mentoring_9.final_keyword;

public class Main {
    public static void main(String[] args) {

        // final değişkene, methoda veya bir classa uygulanır.
        // değişken tanımladığı anda veya concstructor oluşturarak değer atıyoruz
        // sonrasında final değişken değerini değiştiremeyiz sabit kalacaktır.
        // final metodlar override edemeyiz.
        // final class lar extend edilemez


        final Kedi kedi = new Kedi("bobi");
        kedi.ad = "pamuk";

//        kedi = new Kedi("pamuk"); // final objelerin içeriği değiştirilebilir. ancak yeniden obje oluşturamayız.

//        kedi.yas = 2;   // final olduğu yeni bir değer veremedik
        System.out.println(kedi);
        kedi.hareket();  // kendi class ındaki mesajı döndürür.

        //*******************************************************

        String str = "String de bir final class dır";

        System.out.println("ilk hali: " + str);
        System.out.println();
        str = "yeni kelime";
        System.out.println("son hali: " + str);

    }
}
