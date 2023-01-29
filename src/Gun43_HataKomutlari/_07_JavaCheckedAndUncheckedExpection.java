package Gun43_HataKomutlari;

public class _07_JavaCheckedAndUncheckedExpection {
    public static void main(String[] args) {
        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hata durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.

        String str="";

        char ilkHarf=str.charAt(0); // hata olacağı kesin mi? Evet
                        // sen bilirsin, ister try-catch kullan ister kullanma : "Unchecked Expection"

        try {
            Thread.sleep(1000); // try-catch mecbur : "Checked Exception"
        } catch (InterruptedException e) {
            System.out.println("hata oluştu");
        }
    }
}
