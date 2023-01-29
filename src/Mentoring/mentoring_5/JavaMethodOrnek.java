package Mentoring.mentoring_5;

public class JavaMethodOrnek {
    public static void main(String[] args) {
        // dört aritmetik işlemi yapan bir metod yazalım

        System.out.println(hesapla(12, 5, "topla"));
        System.out.println(hesapla(12, 5, "çıkar"));
        System.out.println(hesapla(12, 5, "böl"));
        System.out.println(hesapla(12, 5, "çarp"));
        System.out.println(hesapla(12, 5, "xxxxx"));

    }


    public static double hesapla(double a, int b, String islem){

        switch (islem){
            case "topla" :
                return a + b;

            case "çıkar" :
                return a - b;

            case "çarp" :
                return a * b;

            case "böl" :
                return a / b;
            default:
                System.out.println("Hatalı Giriş Yaptınız...");
        }

        return 0;  // case blokları çalışmaz ise default mesajı yazar ve sonuç sıfır döner
    }
}
