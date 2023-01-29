package Gun35._03_Polymorphism_InstanceOf;

public class Ogrenci extends Kisi{
    private String subesi;

    public Ogrenci(String ad, String soyad, String gorevi,String subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }
    public String getSubesi() {
        return this.subesi;
    }
    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "subesi='" + subesi + '\'' +
                '}';
    }
}
