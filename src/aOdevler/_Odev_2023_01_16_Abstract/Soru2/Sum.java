package aOdevler._Odev_2023_01_16_Abstract.Soru2;

public class Sum extends Calculator{
    @Override
    public int calculating(int a, int b) {
        System.out.print("Toplama: "+a+"+"+b+"=");
        return a+b;
    }
}
