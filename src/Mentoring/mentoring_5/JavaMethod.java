package Mentoring.mentoring_5;

public class JavaMethod {
    public static void main(String[] args) {

        // METHOD nedir: projemiz içinde kullanacağımız işlem için bir kez yazıp her ihtiyaç duyduğumuzda
        // çağırıp kullandığımız yapıdır
        // public -> Access modifier (erişim düzenleyici/belirteci)
        // void -> return tpe dir ve metodun bize hangi sonucu döndürdüğünü belirtir eğer void ise return etmez
        // sadece işlemi yapıp yazdırır.
        // metodAdı -> Camel Case dediğimiz yöntem ile metod adını küçük harfle başlanır birden fazla
        // kelime var ise sonraki kelimelerin ilk harfi büyük yazılır
        // parantezler -> parametre alanıdır parametre varsa dışarıdan bu alana data type ve değişken adı yazılır.
        //  bunun anlamı veri gelecek ve ben metodda kullanacağım bu verileri

        print();


    }

    public static void print(){

        for (int i = 0; i < 3; i++) {
            System.out.println("MERHABA");

        }
    }
}
