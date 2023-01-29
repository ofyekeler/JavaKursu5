package Mentoring.mentoring_11.polmorphism_ornek;

public class ArabaBenzinli extends Araba{


    //Overriding (Dinamic Polymorphism) - Metod Geçersiz Kılma
    // çalışma zamanında (run time) hangi yöntemin yürütüleceğine karar verir.
    // inheritance  ilişkisine ihtiyaç var.

    @Override
    public void motor() {
        System.out.println("Honda araba, Turbo Benzinli motorun performansı iyidir");
    }

    @Override
    public void yakit() {
        System.out.println("Honda benzinli arabanın yakıt deposu hacmi 46.5 lt dir");
    }


    // Overloading (Static Polymorphism) -> Method Aşırı Yükleme
    // aynı class içinde olur ve parametre farklı olmak zorunda
    // derleme zamanı (compile time) polymoprhis denir

    public void yakit(double maxHacim) {

        if (maxHacim < 46.5){
            System.out.println("Elektrikli araba tercih edebilirsiniz");
        }else {
            System.out.println("İstediğiniz kapasiteye sahip aracımız bulunmamaktadır.");
        }

    }


}
