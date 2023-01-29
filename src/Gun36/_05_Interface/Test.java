package Gun36._05_Interface;

public class Test implements IGosterir,IYazdirir{
    @Override
    public void goster() {
        System.out.println("Gösterdi");
    }
    @Override
    public void yaz(String msg) {
        System.out.println(msg);
    }
    @Override
    public void yaz() {
        System.out.println("Yazdırdı");
    }
}
/*
Benzinli arac
  4 tekerlek
  direksiyon
  aynalar
  kapılar
  benzin motoru

Elektrikli arac
  4 tekerlek
  direksiyon
  aynalar
  kapılar
  elektirk motoru
  batarya

hem Elektrikli hem Benzinli Hibrit
  4 tekerlek
  direksiyon
  aynalar
  kapılar
  benzin motoru
  elektrik motoru
  batarya

*/
