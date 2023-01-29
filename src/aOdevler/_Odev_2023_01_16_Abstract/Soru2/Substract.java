package aOdevler._Odev_2023_01_16_Abstract.Soru2;

public class Substract extends Calculator{
    @Override
    public int calculating(int a, int b) {
        System.out.print("Çıkarma: "+a+"-"+b+"=");
        return a-b;
    }
}
