package Gun16;

import java.util.Scanner;

public class _05_Ornek3 {
    public static void main(String[] args) {

        // 5 TV kanalı ismini bir diziye doldurunuz. (TRT, KANALD, ATV, FOX, HABERTÜRK)
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazdırınız.

        String[]kanallar={"TRT", "KANALD", "ATV", "FOX", "HABERTÜRK"};
        int rndKanal= (int)(Math.random()*kanallar.length);
        System.out.println("Random Kanal= " + kanallar[rndKanal]);

        /* Random Kanal= HABERTÜRK */

    }
}
