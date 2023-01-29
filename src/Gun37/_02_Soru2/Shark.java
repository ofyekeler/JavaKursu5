package Gun37._02_Soru2;

public class Shark extends Animal implements ISailing{
    @Override
    public String food() {
        return "Küçük balıkları yer.";
    }

    @Override
    public String sailing() {
        return "Derinlerde yüzebilir.";
    }
}
