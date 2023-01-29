package Gun37._02_Soru2;

public class Duck extends Animal implements IFlying, ISailing{
    @Override
    public String food() {
        return "Örnek arpa yer.";
    }

    @Override
    public String flying() {
        return "Sürü şeklinde uçarlar.";
    }

    @Override
    public String sailing() {
        return "Su üstünde yüzerler.";
    }
}
