package Gun33._02_Ornek1;

public class Ordek extends Hayvan{
    private int kanatAcikligi;

    public Ordek(String renk, int kilo, String cinsi, int kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
            // ek özellik eklerken; metodun parantez içine
                // ve alt satırına ekledir.
    }
    @Override
    public void konustu() {
        System.out.println("Vak vak ladı.");
    }

    public int getKanatAcikligi() {
        return kanatAcikligi;
    }
    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }
}
