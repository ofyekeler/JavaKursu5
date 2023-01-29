package Gun43_HataKomutlari;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryMultipleCatch {
    public static void main(String[] args) {
        System.out.println("Program başladı.");

        try {
        Scanner oku = new Scanner(System.in);

        System.out.print("Sayı1 = "); // 6  ya da "h" girersen, InputMismatchException hatası
        int sayi1 = oku.nextInt();

        System.out.print("Sayı2 = "); // 0 girersen
        int sayi2 = oku.nextInt();

        int bolum = sayi1 / sayi2;
        System.out.println("Bölüm = " + bolum);

        // String kelime=""; ---> 22,23 satırları genel hataya düşmesi için yazıldı
        // kelime.charAt(3);

        } catch (InputMismatchException ex){  // belirli bir hata, sayı dışında karakter girersen...
            System.out.println("Lütfen sayı giriniz");
        } catch (ArithmeticException ex){     // belirli bir hata, payda'ya 0 girersen...
            System.out.println("Sıfıra bölme hatası");
        } catch (Exception ex){               // yukarıdakilerin dışında beklenmeyen hatalar için
            System.out.println("Hata oluştu. "+ex.getMessage());
        }

        System.out.println("Program bitti.");
    }
}
