package Gun13;

public class _02_WhileLoop_Dongu {
    public static void main(String[] args) {

        // Ekrana 5 kez Merhaba yazdırınız.

        int sayac= 1;
        while (sayac<6) // iken yap:  şartı yazıyoruz, dönme şartı
        {
            // her döndükçe yapılacaklar
            System.out.println("Merhaba");

            sayac++; // ya da sayac=sayac+1;  // 1, 2, 3, 4, 5
            // sayac+=2 dersek sayac=sayac+2 nin kısaltmasını yapmış olurduk
        }

        System.out.println("program bitti");

    }
}
