package Mentoring.mentoring_11.polmorphism_ornek;

public class ArabaLPG extends Araba{

    @Override
    public void motor() {
        System.out.println("Honda, motor gücü yüksek gazla çalışan araçlar üretmektedir");
    }

    @Override
    public void yakit() {
        System.out.println("Honda araba LPG deposu 43 lt dir");
    }
}
