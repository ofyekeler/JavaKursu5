package Gun33._02_Ornek1;

public class Kopek extends Hayvan{

    // Şartlı miras.
    // Hayvan class'ında constructor olduğu için
        // bu class ta da constructor olmasını şart koşuyor, aksi takdirde hata verir.

    // (extend Hayvan ın üzerine fakeyle gelince çıkan pencerenin içinde
        // "Create constructor matching super" metnine tıkla.)

    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);// SUPER -> Hayvan class ı (miras aldığı yer)
    }
    // Override Metod, "Ctrl + O" veya "Alt + Insert" te açılan menüden seç.
    // Miras verendeki metodu
    // değiştirerek/özelleştirerek kullanmak istersek...
    @Override
    public void konustu() {
      //  super.konustu();  burayı sil ve aşağıdakini yaz
        System.out.println("Havladı");
    }
}
