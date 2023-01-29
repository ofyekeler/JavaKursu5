package Gun37._01_Soru1;

import java.util.ArrayList;

public class FabrikaMain {

    /* Ekteki Tasarıma göre gerekli modülleri yazınız.
    Sonra bir main metodunda, TeslaCar dan, ToyotaPirus
    dan ve cityBus dan birer nesne üretiniz.

- ürettiğiniz nesneleri bir ArrayListe ekletip, daha sonra
    bu ArrayList i bir döngü ile metodlarını ekrana yazdırınız.

            engine (double)
    model (String)
    metodların hepsinin tipi String */
    public static void main(String[] args) {
        TeslaCar tesla=new TeslaCar(3100,"model 5");
        ToyotaPrius pirus=new ToyotaPrius(1200,"sedan");
        Bus bus=new Bus(7000,"Iveco");

        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(pirus);
        arabalar.add(bus);

        for (Vehicle v: arabalar){
            // GETSIMPLENAME  class adını yazdırmanın kolay yöntemi
            System.out.println();
            System.out.println("Araba'nın adı: "+v.getClass().getSimpleName());
            System.out.println("**************************");

            System.out.println("Model= " + v.getModel());
            System.out.println("Motor= " + v.getEngine());

            if (v instanceof TeslaCar){
                System.out.println(((TeslaCar)v).drive());
                System.out.println(((TeslaCar)v).changeBattery());
            } else if (v instanceof ToyotaPrius) {
                System.out.println(((ToyotaPrius)v).drive());
                System.out.println(((ToyotaPrius)v).changeBattery());
                System.out.println(((ToyotaPrius)v).changeOil());
            } else if (v instanceof Bus) {
                System.out.println(((Bus)v).drive());
                System.out.println(((Bus)v).changeDeisel());
            }
/*
Araba'nın adı: TeslaCar
**************************
Model= model 5
Motor= 3100.0
Auto pilot özelliği var
Batarya 9 yıl ömrü var.

Araba'nın adı: ToyotaPrius
**************************
Model= sedan
Motor= 1200.0
İlk 3 km elektrik ile gider
Ömür boyu kullan.
Bir depo ile 300 km gider.

Araba'nın adı: Bus
**************************
Model= Iveco
Motor= 7000.0
En fazla 90 km/sa hız yapar.
1 depo ile 1.000 km gider.
        */
        }
    }
}
