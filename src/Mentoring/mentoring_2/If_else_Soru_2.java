package Mentoring.mentoring_2;

import java.util.Scanner;

public class If_else_Soru_2 {
    public static void main(String[] args) {

        // Mantıksal Operatorler  && -> ve,  || -> veya

        String userName = "TechnoStudy";
        String password = "12345";

        // ORNEK SORU: Yukarıdaki kayıtlı bilgilere göre kullanıcıdan, kullanıcı adı ve şifre alarak
        // 4 farklı opsiyon için login işlemlerini yazınız.

        // 1.opsiyon - kullanıcıd adı ve şifre yanlış
        // 2.opsiyon - şifre yanlış
        // 3.opsiyon - kullanıcıd adı yanlış
        // 4.opsiyon - sisteme giriş başarılı

        Scanner input = new Scanner(System.in);

        System.out.print("username: ");
        String kullaniciAdi = input.nextLine();

        System.out.print("password: ");
        String sifre = input.nextLine();

        if (!(userName.equals(kullaniciAdi)) && !(password.equals(sifre))){
            System.out.println("kullanıcı adı ve şifre hatalı");
        } else if ((userName.equals(kullaniciAdi)) && !(password.equals(sifre))) {
            System.out.println("şifre hatalı");
        } else if (!(userName.equals(kullaniciAdi)) && (password.equals(sifre))) {
            System.out.println("kullanıcı adı hatalı");
        }else {
            System.out.println("sisteme giriş başarılı");
        }


    }
}
