package Gun43_HataKomutlari;

public class _01_JavaException {
    public static void main(String[] args) {

        // Daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
        // Derleme zamanı yani "COMPILE ERROR", Exception diyoruz.

        System.out.println("program çalışmala başladı");
        // String kelime=""
        // noktalı virgül ";" olmadığı için Compile Error (Exception) verdi. Çalışmadı bile.
        String kelime="";
        char harf = kelime.charAt(3); // Runtime Error (Exception): Index 3 out of bounds for length 0

        //program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
        //ÇALIŞMA ZAMANI yani "RUNTIME ERROR", Exception diyoruz.

        System.out.println("program bitti");
    }
}
