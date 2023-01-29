package Mentoring.mentoring_9.inheritance_ornek2;

public class Tank extends ZirhliArac {

    private boolean atesliSilah;

    public Tank(String ad, int menzil, String yakitTipi, boolean paletVarmi, boolean atesliSilah) {
        super(ad, menzil, yakitTipi, paletVarmi);
        this.atesliSilah = atesliSilah;
    }

    @Override
    public void gorev() {
        System.out.println("Ateşli silahlarıyla tank göreve hazır");
    }

    @Override
    public String toString() {
        return "Tank{" +
                super.toString() + " "+
                "atesliSilah=" + atesliSilah +
                '}';
    }
}
