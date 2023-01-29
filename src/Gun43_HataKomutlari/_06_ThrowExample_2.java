package Gun43_HataKomutlari;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {
        // _06_ nolu yazılım, daha çok aşağıdaki THROW formatında yazılır.
        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.println("Yeni şifreniz= ");
        String newPassword = oku.nextLine();

        try {
            if (newPassword.length()<8) // bu msj ile suni hata oluştur
                throw new Exception("Şifre en az 8 karakterden oluşmalı");
            if (newPassword.length()>15) // bu msj ile suni hata oluştur
                throw new Exception("Şifre en fazla 15 karakterden oluşmalı");
        } catch (Exception ex){
            // hatalar bir yere toplanıp, hepsi için yapıöması gereken işlemler
            // bir arada burada yapılabilir. Mesela log bulma gibi.
            System.out.println("Lütfen dikkat !!!");
            System.out.println(ex.getMessage());
            // log tutma

            // kullanıcıyı uyarmak amaçlı,
            // kendi belirlediğimiz kuralların dışına çıkıldığında msj vermek için kullanılır.
        }
    }
}
