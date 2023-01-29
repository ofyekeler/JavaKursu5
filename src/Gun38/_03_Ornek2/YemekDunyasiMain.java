package Gun38._03_Ornek2;

public class YemekDunyasiMain {
    /* Ekteki şekle göre Classları oluşturup,
       YemekDunyasi isimli mainde birer nesne oluşturup yazdırınız. */
    public static void main(String[] args) {

        Baklava b=new Baklava();
        b.setName("Baklava");
        b.madeIn();
        b.taste();
        System.out.println();

        GreekSalad g=new GreekSalad();
        g.setName("Greek Salad");
        g.madeIn();
        g.taste();
        System.out.println();

        CheeseCake c=new CheeseCake();
        c.setName("Cheese Cake");
        c.madeIn();
        c.taste();
        System.out.println();

        SezerSalad s=new SezerSalad();
        s.setName("Sezer Salad");
        s.madeIn();
        s.taste();
    }
}
/*
Baklava Türkiyenindir
tatlı,  şekerli, iyi

Greek Salad Yunanlıların
ekşi, limonlu, sirkeli

Cheese Cake Fransanındır.
tatlı,  şekerli, iyi

Sezer Salad Akdeniz
ekşi, limonlu, sirkeli
*/