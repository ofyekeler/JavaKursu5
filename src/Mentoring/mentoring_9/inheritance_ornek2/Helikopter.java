package Mentoring.mentoring_9.inheritance_ornek2;

public class Helikopter extends ZirhliArac{


    public Helikopter(String ad, int menzil, String yakitTipi, boolean paletVarmi) {
        super(ad, menzil, yakitTipi, paletVarmi);
    }

    @Override
    public void gorev() {
        System.out.println("Helikopterin pervaneleri çalıştı ve göreve hazır");
    }
}
