package Gun36._06_Interface;

public class Dikdörtgen implements ISekil {
    @Override
    public double cevresi(double kisaKenar, double uzunKenar) {
        return (kisaKenar+uzunKenar)*2;
    }

    @Override
    public double alani(double kisaKenar, double uzunKenar) {
        return kisaKenar*uzunKenar;
    }
}
