package Mentoring.mentoring_9.inheritance_ornek2;

public class Ucak extends ZirhliArac{

    private int fuze;

    public Ucak(String ad, int menzil, String yakitTipi, boolean paletVarmi, int fuze) {
        super(ad, menzil, yakitTipi, paletVarmi);
        this.fuze = fuze;
    }

    @Override
    public void gorev() {
        System.out.println("Uçak motorları çalıştı ve göreve hazır");
    }

    @Override
    public String toString() {
        return "Ucak{" +
                super.toString() + " " +
                "fuze=" + fuze +
                '}';
    }
}
