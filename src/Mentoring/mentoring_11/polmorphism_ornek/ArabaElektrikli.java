package Mentoring.mentoring_11.polmorphism_ornek;

public class ArabaElektrikli extends Araba{

    @Override
    public void motor() {
        System.out.println("Honda elektrikli araba çevre dostudur");
    }

    @Override
    public void yakit() {
        System.out.println("Honda elektrikli araba, şarj edilerek kullanılır");
    }
}
