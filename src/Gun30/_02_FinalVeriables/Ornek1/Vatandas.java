package Gun30._02_FinalVeriables.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo; // FINAL yazdığımızda artık DEĞİŞTİRİLEMEZ, değer ATAYAMAZ !!!

    static int tcNoSayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
