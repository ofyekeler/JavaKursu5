package Gun34._01_Ornek1;

public class Arac {
    private String renk;
    private String motorHacmi;
    private String marka;

    public Arac(String renk, String motorHacmi, String marka) {
        setRenk(renk);
        setMotorHacmi(motorHacmi);
        setMarka(marka);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motorHacmi='" + motorHacmi + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }
}
