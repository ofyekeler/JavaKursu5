package Gun43_HataKomutlari;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {
        long startTime=0;
        String str="";

        try {
            // hata olma olasılığının olduğu kodlar
            startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki kısım.");
            char ilkHarf=str.charAt(0);
            System.out.println("Hatadan sonraki kısım");
        }
        catch (Exception ex){
            // hata olduğunda yapılacaklar
            System.out.println("Catch bloğu çalıştı");
        }
        finally { // hata olsa da çalışın olmasa da çalışan kısım
                  // bu bölüm yukarıdaki süreçle ilgili olduğunu göstermek için finally içinde yazılır.
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
        }
        System.out.println("Diğer çalışan kodlar");
        System.out.println("Program sonu");
    }
}
