package aOdevler._Odev_2023_01_16_Abstract.Soru1;

public class Main {
    public static void main(String[] args) {

        Tigers tigers=new Tigers();
        System.out.println(tigers.getClass().getSimpleName());
        tigers.talk();
        tigers.walk();
        System.out.println();

        Lions lions=new Lions();
        System.out.println(lions.getClass().getSimpleName());
        lions.talk();
        lions.walk();
        System.out.println();

        HomeCats homeCats=new HomeCats();
        System.out.println(homeCats.getClass().getSimpleName());
        homeCats.talk();
        homeCats.walk();
/*
Tigers
Tiger is talking..
Cat is walking...

Lions
lion is talking..
Cat is walking...

HomeCats
HomeCat is talking..
Cat is walking...
*/
    }
}
