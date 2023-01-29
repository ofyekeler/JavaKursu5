package MyFuch_Bekletme;

public class MyFunc {
    public static void Bekle(int sn){
        // Thread.sleep(1000*sn);  ->  milisaniye cinsinden ötürü 1000 ile çarpıyoruz
        // HATA KORUMASI İÇİN =>  SLEEP in üzerine gel "More Action" a tıkla,
        // akabinde "SURROUND WITH TRY/CATCH" e tıkla.
        try {
            Thread.sleep(1000*sn); //
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
