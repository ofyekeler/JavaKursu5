package Gun37._01_Soru1;

public class Bus extends Vehicle implements IDeisel{
    public Bus(double engine, String model) {
        super(engine, model);
    }
    @Override
    public String changeDeisel() {
        return "1 depo ile 1.000 km gider.";
    }
    @Override
    public String drive() {
        return "En fazla 90 km/sa hız yapar.";
    }
}
