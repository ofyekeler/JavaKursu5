package aOdevler._Odev_2023_01_16_Abstract.Soru2;

public class Multiply extends Calculator{
    @Override
    public int calculating(int a, int b) {
        System.out.print("Çarpma: "+a+"*"+b+"=");
        return a*b;
    }
}
