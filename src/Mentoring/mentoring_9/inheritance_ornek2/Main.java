package Mentoring.mentoring_9.inheritance_ornek2;

public class Main {
    public static void main(String[] args) {

        // bir savaş oyunu için zırhlı araçlar tasarımı yaptık.

        Ucak ucak = new Ucak("Kartal", 1000, "JET-A1", false, 4);
        System.out.println(ucak);
        ucak.gorev();

        System.out.println();
        Helikopter helikopter = new Helikopter("Şahin", 800, "JET-A1", false);
        System.out.println(helikopter);
        helikopter.gorev();

        System.out.println();
        Tank tank = new Tank("Tank1", 500, "JET-A2", true, true);
        System.out.println(tank);
        tank.gorev();

    }
}
