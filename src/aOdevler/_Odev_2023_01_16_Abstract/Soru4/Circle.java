package aOdevler._Odev_2023_01_16_Abstract.Soru4;

public class Circle extends Data{
    @Override
    double getArea() {
        return pi*getYaricapi()*getYaricapi();
    }
}
