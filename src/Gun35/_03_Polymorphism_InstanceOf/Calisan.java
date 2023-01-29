package Gun35._03_Polymorphism_InstanceOf;

public class Calisan extends Kisi{
    private String departmani;
    public Calisan(String ad, String soyad, String gorevi,String departmani) {
        super(ad, soyad, gorevi);
        setDepartmani(departmani);
    }

    public String getDepartmani() {
        return this.departmani;
    }
    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }
    @Override
    public String toString() {
        return "Calisan{" +
                "departmani='" + departmani + '\'' +
                '}';
    }
}