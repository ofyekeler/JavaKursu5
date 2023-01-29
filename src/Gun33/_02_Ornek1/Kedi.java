package Gun33._02_Ornek1;

public class Kedi extends Hayvan{
    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("Miyavladı.");
    }
}
